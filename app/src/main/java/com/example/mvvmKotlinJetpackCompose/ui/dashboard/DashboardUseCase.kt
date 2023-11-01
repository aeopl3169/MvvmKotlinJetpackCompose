package com.example.mvvmKotlinJetpackCompose.ui.dashboard

import com.example.mvvmKotlinJetpackCompose.data.network.Resource
import com.example.mvvmKotlinJetpackCompose.data.network.model.DashboardResponse
import com.example.mvvmKotlinJetpackCompose.data.repos.DashboardRepository
import com.example.mvvmKotlinJetpackCompose.ui.base.BaseUseCase
import com.example.mvvmKotlinJetpackCompose.util.coroutines.DispatcherProvider
import javax.inject.Inject

class DashboardUseCase @Inject constructor(
    appDispatcher: DispatcherProvider,
    dashboardRepository: DashboardRepository
) : BaseUseCase<DashboardRepository>(dashboardRepository, appDispatcher) {
    //add dashboard business logic
    suspend fun getDashboardData(): Resource<DashboardResponse> {

        return getRepository().getDashboardData()
    }

    fun getUserId(): String {

        return getRepository().getUserId()
    }

    fun logout() {
        getRepository().logout()


    }


}