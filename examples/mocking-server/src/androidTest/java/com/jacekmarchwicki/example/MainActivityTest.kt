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

import android.app.Activity
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import okhttp3.mockwebserver.MockResponse
import org.junit.Before

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField val activityRule = activityTestRule<MainActivity>()
    @Rule
    @JvmField val mockingRule = MockingRule()

    @Before
    fun setUp() {
        mockingRule.mock.mock(MockResponse().setBody("Mock response"))
            {request -> request.path == "/helloworld.txt" && request.method == "GET"}
    }

    @Test
    fun mockingApiResponses() {
        activityRule.launchActivity()

        // Instead of using Thread.sleep you should read the following article:
        // https://jacek-marchwicki.github.io/blog/no-sleeping-during-testing-rxjava-app/
        Thread.sleep(5000L)

        onView(withText("Response: Mock response"))
                .check(matches(isDisplayed()))
    }
}

inline fun <reified T : Activity> activityTestRule(): ActivityTestRule<T> = ActivityTestRule(T::class.java, false, false)
fun <T : Activity> ActivityTestRule<T>.launchActivity(): T = this.launchActivity(null)