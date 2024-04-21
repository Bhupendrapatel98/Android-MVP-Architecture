package com.app.androidarchetctureapplication.repository

import com.app.androidarchetctureapplication.model.TodoItem

interface TodoRepository {
    suspend fun getTodos(): List<TodoItem>
}