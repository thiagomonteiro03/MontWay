package com.montway.start.framework

import com.montway.start.data.repository.NoteLocalDataSource
import com.montway.start.data.repository.NoteRepository
import com.montway.start.domain.model.Note
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val favoritesLocalDataSource: NoteLocalDataSource
): NoteRepository {
    override fun getAll(): Flow<List<Note>> {
        return favoritesLocalDataSource.getAll()
    }

    override suspend fun saveNote(note: Note) {
        return favoritesLocalDataSource.saveNote(note)
    }

    override suspend fun deleteById(id: String) {
        return favoritesLocalDataSource.deleteById(id)
    }
}