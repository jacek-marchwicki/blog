package com.example.sleep

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.MediumTest
import android.support.test.runner.AndroidJUnit4
import com.example.sleep.rules.RxIdlingResourcesRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@MediumTest
class MainActivityBetterTest {

    @Rule @JvmField val rxIdlerRule = RxIdlingResourcesRule()
    @Rule @JvmField val activityRule = activityTestRule<MainActivity>()

    @Test
    fun afterStartActivity_verifyIfDataIsDisplayedFromTheServer() {
        activityRule.launchActivity()

        // No Thread.sleep(5000) necessary, because we use RxIdlingResourcesRule

        onView(withId(R.id.main_activity_text))
                .check(matches(withText("data from the server")))
                .check(matches(isDisplayed()))
    }

}
