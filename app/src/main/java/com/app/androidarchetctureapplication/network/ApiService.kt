package com.app.androidarchetctureapplication.network

import com.app.androidarchetctureapplication.model.TodoItem
import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    fun getTodos(): List<TodoItem>

}