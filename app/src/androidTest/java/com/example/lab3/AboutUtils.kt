package com.example.lab3

import android.view.Gravity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.DrawerMatchers.isClosed
import androidx.test.espresso.contrib.NavigationViewActions
import androidx.test.espresso.matcher.ViewMatchers.*

const val idActivityAbout = R.id.activity_about
const val idFragment1 = R.id.fragment1
const val idFragment2 = R.id.fragment2
const val idFragment3 = R.id.fragment3

//private fun openAboutViaBottomNav() {
//    onView(withId(R.id.nav_view)).perform(click())
//}

private fun openAboutViaDrawer() {
    // Open Drawer to click on navigation.
    onView(withId(R.id.drawer_layout))
        .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
        .perform(DrawerActions.open()); // Open Drawer

    // Start the screen of your activity.
    onView(withId(R.id.bnToAbout)).perform(click())
}

//private fun openAboutViaOptions() {
//    openContextualActionModeOverflowMenu()
//    onView(withText(R.string.title_about))
//        .perform(click())
//}

fun openAbout() = openAboutViaDrawer()

fun toFirst() {
    onView(withId(R.id.bnToFirst)).perform(click())
}

fun toSecond() {
    onView(withId(R.id.bnToSecond)).perform(click())
}

fun toThird() {
    onView(withId(R.id.bnToThird)).perform(click())
}

fun isDisplaying(id: Int) {
    onView(withId(id)).check(matches(isDisplayed()))
}

fun pressBackUpNav() {
    onView(withContentDescription(R.string.nav_app_bar_navigate_up_description)).perform(click())
}
