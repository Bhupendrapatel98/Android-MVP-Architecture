package com.app.androidarchetctureapplication.presenter

import com.app.androidarchetctureapplication.network.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class TodoPresenter @Inject constructor(
    private val view: TodoContract.View,
    private val apiService: ApiService
) : TodoContract.Presenter {
    override fun getTodos() {
        view.showLoading()
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val todos = apiService.getTodos()
                view.showTodos(todos)
                view.hideLoading()
            } catch (e: Exception) {
                view.showError(e.message ?: "Unknown error")
                view.hideLoading()
            }
        }
    }

}