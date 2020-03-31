/*
 * Copyright (C) 2019-2020 Jacek Marchwicki <jacek.marchwicki@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jacekmarchwicki.example

import android.util.Log
import okhttp3.Headers
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import okio.Buffer
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import java.net.HttpURLConnection
import java.nio.charset.Charset

private class OverrideHostInterceptor(val httpUrl: HttpUrl) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(chain.request().let {
        it.newBuilder()
                .url(it.url.newBuilder()
                        .host(httpUrl.host)
                        .port(httpUrl.port)
                        .scheme(httpUrl.scheme)
                        .build())
                .addHeader("X-Orig-Url", it.url.toString())
                .build()
    })


    companion object {
        fun getUrl(request: RecordedRequest): HttpUrl? {
            val originalUrl = request.headers["X-Orig-Url"];
            return if (originalUrl == null) request.requestUrl else originalUrl.toHttpUrlOrNull()
        }
        fun fixHeaders(headers: Headers): Headers = headers.newBuilder()
                .removeAll("X-Orig-Url")
                .removeAll("Host")
                .build()
    }
}

typealias RequestPredicate =  (request: RecordedRequest) -> Boolean

typealias Mock = Pair<RequestPredicate, MockResponse>

class MockingDispatcher : Dispatcher() {
    private val mocks = mutableListOf<Mock>();

    fun mock(response: MockResponse, predicate: RequestPredicate) =
            mocks.add(0, Pair(predicate, response))

    fun reset() = mocks.clear()

    override fun dispatch(request: RecordedRequest): MockResponse {
        val found = mocks.firstOrNull { (predicate, _) -> predicate(request)}?.second;
        if (found != null) {
            return found
        }
        logRequest(request)
        return MockResponse().setResponseCode(HttpURLConnection.HTTP_NOT_FOUND)
    }

    private fun logRequest(request: RecordedRequest) {
        Log.d("MockingDispatcher",
                "mockingRule.mock.mock(MockResponse().setBody(\"Mock response\"))\n" +
                        "  {request -> request.path == \"${request.path}\" && request.method == \"${request.method}\"}")
        Log.w("MockingDispatcher", "Following request not mocked: ${CurlGenerator.toCurl(request)}")
    }
}

class MockingRule : TestWatcher() {
    private var description: Description? = null

    val mock = MockingDispatcher()
    private val server = MockWebServer().apply {
        dispatcher = mock
    }

    override fun starting(description: Description) {
        server.start()
        this.description = description
        val apiUrl = server.url("/")
        InterceptorWrapper.wrappedInterceptor = OverrideHostInterceptor(apiUrl)
    }

    override fun finished(description: Description?) {
        InterceptorWrapper.wrappedInterceptor = null
        server.shutdown()
    }
}

internal object CurlGenerator {
    fun toCurl(request: RecordedRequest, limit: Long = -1L): String = toBash(toCurlArgs(request, limit))

    private fun toCurlArgs(request: RecordedRequest, limit: Long = -1L): List<String> = listOf(
            listOf("curl", "-L"),
            methodName(request),
            headers(request),
            body(request, limit),
            url(request)
    ).flatten()

    private fun url(request: RecordedRequest) =
            listOf(OverrideHostInterceptor.getUrl(request).toString())

    private fun headers(request: RecordedRequest): List<String> =
            OverrideHostInterceptor.fixHeaders(request.headers)
                .let { headers -> (0 until headers.size).map { headers.name(it) to headers.value(it) } }
                .flatMap { (name, value) -> listOf("-H", "$name: $value") }

    private fun methodName(request: RecordedRequest): List<String> = (request.method
            ?: "get").toUpperCase().let { if (it == "GET") listOf() else listOf("-X", it) }

    private fun body(request: RecordedRequest, limit: Long): List<String> =
            request.body.let { if (it.size == 0L) listOf() else listOf("-d", getBodyAsString(it, limit)) }

    private fun getBodyAsString(body: Buffer, limit: Long): String = try {
        Buffer().use { sink ->
            body.write(sink, minOf(body.size, limit))
            sink.readString(Charset.defaultCharset())
        }
    } catch (e: Exception) {
        "Error while reading body: $e"
    }

    private val simpleParam = Regex("^[a-zA-Z-]+$")

    private fun toBash(args: List<String>): String {
        return args.joinToString(" ") {
            if (simpleParam.matches(it))
                it
            else "'${it.replace("\'", "\\\'")}'"
        }
    }
}