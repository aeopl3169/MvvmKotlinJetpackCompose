package com.example.mvvmKotlinJetpackCompose.ui.base


open class BaseViewModelRepository<T : BaseRepository>(repo: T) : BaseViewModel<T>(repo) {


    fun getRepository(): T {

        return anyType
    }


}