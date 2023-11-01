package com.example.mvvmKotlinJetpackCompose.data.network

import android.content.Context
import io.mockk.mockk
import io.mockk.spyk
import org.junit.Before
import org.junit.Test

class AppApiHelperTest {

    lateinit var sut: AppApiHelper;
    val mContextMock = mockk<Context>()
    val apiHeader: ApiHeader = mockk()

    @Before
    fun setUp() {
        sut = spyk(AppApiHelper(mContextMock, apiHeader))
    }

    @Test
    fun test() {

    }

}