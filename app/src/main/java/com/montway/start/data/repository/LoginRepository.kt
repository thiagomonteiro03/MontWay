package com.montway.start.data.repository

import kotlinx.coroutines.flow.Flow

interface LoginRepository {

    suspend fun authentication(login: String): Flow<String>

}