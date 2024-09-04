package com.montway.start.framework.di

import com.montway.start.data.repository.LoginRemoteDataSource
import com.montway.start.data.repository.LoginRepository
import com.montway.start.data.repository.NoteLocalDataSource
import com.montway.start.data.repository.NoteRepository
import com.montway.start.framework.LoginRepositoryImpl
import com.montway.start.framework.NoteRepositoryImpl
import com.montway.start.framework.local.RoomNoteDataSource
import com.montway.start.framework.remote.RetrofitLoginRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindNoteRepository(repository: NoteRepositoryImpl): NoteRepository

    @Binds
    fun bindNoteLocalDataSource(dataSource: RoomNoteDataSource): NoteLocalDataSource

    @Binds
    fun bindLoginRepository(repository: LoginRepositoryImpl): LoginRepository

    @Binds
    fun bindLoginLocalDataSource(dataSource: RetrofitLoginRemoteDataSource): LoginRemoteDataSource

}