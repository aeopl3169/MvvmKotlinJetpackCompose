package com.example.mvvmKotlinJetpackCompose.ui.dashboard

import androidx.activity.ComponentActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.mvvmKotlinJetpackCompose.ui.BaseInstrument
import org.junit.Before
import org.junit.Rule

@ExperimentalFoundationApi
class DashboardActivityTest : BaseInstrument() {


    @get : Rule
    val composeTestRule = createAndroidComposeRule(DashboardActivity::class.java)
    lateinit var activity: ComponentActivity

    @Before
    override fun setUp() {
        activity = composeTestRule.activity
    }


}