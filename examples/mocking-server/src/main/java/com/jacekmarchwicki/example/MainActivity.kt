/*
 * Copyright (C) 2020 Jacek Marchwicki <jacek.marchwicki@gmail.com>
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

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val client = OkHttpClient.Builder()
            .addInterceptor(InterceptorWrapper)
            .build()

    private fun executeRequest() {
        val request = Request.Builder()
                .url("http://publicobject.com/helloworld.txt")
                .build()
        activity_main_text_view.text = "Executing..."

        // You'd probably should use Retrofit :)
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread {
                    activity_main_text_view.text = "Error: ${e.localizedMessage}"
                }
            }

            override fun onResponse(call: Call, response: Response) {
                val responseText = response.body?.string()
                response.use {
                    runOnUiThread {
                        activity_main_text_view.text =
                                if (response.isSuccessful) "Response: $responseText"
                                else "Error response $responseText"
                    }
                }
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_button.setOnClickListener {
            executeRequest();
        }
        executeRequest();
    }

}