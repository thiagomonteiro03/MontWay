package com.montway.start.framework.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.montway.start.framework.db.dao.TodoDao
import com.montway.start.framework.db.model.TodoEntity

@Database(
    entities = [
        TodoEntity::class
    ],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun todoDao(): TodoDao

}