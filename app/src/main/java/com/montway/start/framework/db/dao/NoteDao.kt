package com.montway.start.framework.db.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.montway.start.framework.db.model.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query(
        """
        SELECT * FROM note
    """
    )
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Upsert
    suspend fun create(vararg lists: NoteEntity)

    @Query(
        """
        DELETE FROM note WHERE id = :id
    """)
    suspend fun deleteNoteById(id: String)

}