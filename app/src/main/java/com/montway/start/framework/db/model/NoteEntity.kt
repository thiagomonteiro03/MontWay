package com.montway.start.framework.db.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.montway.start.domain.model.Note
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(
    tableName = "note"
)
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val items: List<String>
) : Parcelable

fun List<NoteEntity>.toNoteModel() = map {
    Note(it.id, it.name, it.items)
}

