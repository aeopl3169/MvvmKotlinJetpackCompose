package com.example.mvvmKotlinJetpackCompose.di.login

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

@LoginScope
@DefineComponent(parent = SingletonComponent::class)
interface LoginComponent {
}