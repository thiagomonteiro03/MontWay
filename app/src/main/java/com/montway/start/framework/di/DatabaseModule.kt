package com.montway.start.framework.di

import android.content.Context
import androidx.room.Room
import com.montway.start.framework.db.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesNoteDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, NoteDatabase::class.java, "montwayNote")
            .build()

    @Provides
    fun providesNoteDao(database: NoteDatabase) = database.noteDao()

}