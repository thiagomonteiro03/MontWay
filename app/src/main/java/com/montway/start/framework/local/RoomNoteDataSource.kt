package com.montway.start.framework.local

import com.montway.start.data.repository.NoteLocalDataSource
import com.montway.start.domain.model.Note
import com.montway.start.framework.db.dao.NoteDao
import com.montway.start.framework.db.model.NoteEntity
import com.montway.start.framework.db.model.toNoteModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RoomNoteDataSource @Inject constructor(
    private val dao: NoteDao
): NoteLocalDataSource {

    override fun getAll(): Flow<List<Note>> {
        return dao.getAllNotes().map {
            it.toNoteModel()
        }
    }

    override suspend fun saveNote(note: Note) {
        dao.create(note.toNoteEntity())
    }

    override suspend fun deleteById(id: String) {
        dao.deleteNoteById(id)
    }

    private fun Note.toNoteEntity() = NoteEntity(id, name, items)

}