package com.montway.start.domain.model

data class Note(
    val id: Int,
    val name: String,
    val items: List<String>
)