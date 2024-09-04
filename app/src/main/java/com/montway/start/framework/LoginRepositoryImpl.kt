package com.montway.start.framework

import com.montway.start.data.repository.LoginRemoteDataSource
import com.montway.start.data.repository.LoginRepository
import com.montway.start.domain.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val loginRemoteDataSource: LoginRemoteDataSource
): LoginRepository {
    override suspend fun authentication(login: String): Flow<String> {
        return loginRemoteDataSource.authentication(login)
    }
}