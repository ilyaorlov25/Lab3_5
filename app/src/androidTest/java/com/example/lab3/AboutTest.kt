package com.example.lab3

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.pressBack
import com.example.lab3.*

@RunWith(AndroidJUnit4::class)
class AboutTest {
    @Before
    fun launch() {
        launchActivity<MainActivity>()
    }

    @Test
    fun testFirstToAbout() {
        openAbout()
        isDisplaying(idActivityAbout)
        pressBack()
        isDisplaying(idFragment1)
    }

    @Test
    fun testSecondToAbout() {
        toSecond()
        openAbout()
        isDisplaying(idActivityAbout)
        pressBack()
        isDisplaying(idFragment2)
    }

    @Test
    fun testThirdToAbout() {
        toSecond()
        toThird()
        openAbout()
        isDisplaying(idActivityAbout)
        pressBack()
    }

    /**
     * Navigation up
     */

    /*
    @Test
    fun testNavUpInAbout() {
        openAbout()
        pressBackUpNav()
        isDisplaying(idFragment1)

        toSecond()
        openAbout()
        pressBackUpNav()
        isDisplaying(idFragment2)

        toThird()
        openAbout()
        pressBackUpNav()
        isDisplaying(idFragment3)
    }
     */
}