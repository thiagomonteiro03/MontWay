package com.montway.start.data.repository

import com.montway.start.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAll(): Flow<List<Note>>

    suspend fun saveNote(note: Note)

    suspend fun deleteById(id: String)

}