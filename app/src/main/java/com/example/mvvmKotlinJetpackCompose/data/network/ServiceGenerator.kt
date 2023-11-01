package com.example.mvvmKotlinJetpackCompose.data.network

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

const val timeoutRead = 30
const val contentType = "Content-Type"
const val contentTypeValue = "application/json"
const val timeoutConnect = 30
const val baseUrl = "https://your.com/Api/"

@Singleton
class ServiceGenerator @Inject constructor() {

    @Inject
    lateinit var service: Service

    @Inject
    lateinit var retrofit: Retrofit

    @Inject
    lateinit var protectedApiHeader: ApiHeader.ProtectedApiHeader


}