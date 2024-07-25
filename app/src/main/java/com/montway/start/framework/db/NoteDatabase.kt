package com.montway.start.framework.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.montway.start.framework.db.dao.NoteDao
import com.montway.start.framework.db.model.NoteEntity

@Database(
    entities = [
        NoteEntity::class
    ],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDao

}