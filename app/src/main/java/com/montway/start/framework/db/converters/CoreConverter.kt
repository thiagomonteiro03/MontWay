package com.montway.start.framework.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object CoreConverter {

    @TypeConverter
    fun fromListStringToString(items: List<String>?) = items?.let {
        Gson().toJson(it)
    }

    @TypeConverter
    fun fromStringToListString(items: String?): List<String>? =
        items?.let { Gson().fromJson(it, object : TypeToken<List<String>>() {}.type) }

}