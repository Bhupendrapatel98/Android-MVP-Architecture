package com.app.androidarchetctureapplication.presenter

import com.app.androidarchetctureapplication.model.TodoItem

interface TodoContract {

    interface View {
        fun showLoading()
        fun hideLoading()
        fun showTodos(todos: List<TodoItem>)
        fun showError(message: String)
    }

    interface Presenter {
        fun getTodos()
    }
}