package com.example.mvvmKotlinJetpackCompose.ui.base


open class BaseViewModelUseCase<T>(private val useCase: T) : BaseViewModel<T>(useCase) {


    fun getUseCase(): T {

        return useCase
    }


}