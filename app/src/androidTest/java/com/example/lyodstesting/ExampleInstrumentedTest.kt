package com.example.lyodstesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule


import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith




@RunWith(AndroidJUnit4::class)
class MainActivityTest {


    @get:Rule
    val mActivityRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun testUsernameDisplay() {
        // Type username
        onView(withId(R.id.editTextUsername))
            .perform(typeText("Ansari"))
        Thread.sleep(1000)
        // Click submit button
        onView(withId(R.id.buttonSubmit))
            .perform(click())
        Thread.sleep(1000)
        // Verify username displayed
        onView(withId(R.id.textViewUsername))
            .check(matches(isDisplayed()))
        onView(withId(R.id.textViewUsername))
            .check(matches(withText("Ansari123")))
        Thread.sleep(2000)
    }
}
