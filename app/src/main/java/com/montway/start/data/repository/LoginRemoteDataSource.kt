package com.montway.start.data.repository

import kotlinx.coroutines.flow.Flow

interface LoginRemoteDataSource {
    suspend fun authentication(login: String): Flow<String>
}