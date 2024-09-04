package com.montway.start.framework.remote

import com.montway.start.data.repository.LoginRemoteDataSource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class RetrofitLoginRemoteDataSource @Inject constructor(
//    private val loginService: LoginService
): LoginRemoteDataSource {
    override suspend fun authentication(login: String): Flow<String> {
//        loginService.authentication()
        delay(2000)
        return flowOf(login)
    }
}