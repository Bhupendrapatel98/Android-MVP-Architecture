package com.app.androidarchetctureapplication.model

data class TodoItem(
    val userId: Int,
    val id: Int,
    val title: String,
    val completed: Boolean
)