package com.app.androidarchetctureapplication.repository

import com.app.androidarchetctureapplication.model.TodoItem
import com.app.androidarchetctureapplication.network.ApiService
import javax.inject.Inject

class TodoRepositoryImpl @Inject constructor(private val apiService: ApiService) :TodoRepository{
    override suspend fun getTodos(): List<TodoItem> {
        return apiService.getTodos()
    }
}