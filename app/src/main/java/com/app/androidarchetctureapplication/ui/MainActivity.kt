package com.app.androidarchetctureapplication.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.app.androidarchetctureapplication.R
import com.app.androidarchetctureapplication.model.TodoItem
import com.app.androidarchetctureapplication.presenter.TodoContract
import com.app.androidarchetctureapplication.presenter.TodoPresenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), TodoContract.View {

    @Inject
    lateinit var todoPresenter: TodoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        todoPresenter.getTodos()
    }

    override fun showLoading() {
        Log.d("Loading1", "showLoading: ")
    }

    override fun hideLoading() {
        Log.d("Loading2", "showLoading: ")
    }

    override fun showTodos(todos: List<TodoItem>) {
        Log.d("Loading3", "showLoading: $todos")
    }

    override fun showError(message: String) {
        Log.d("Loading4", "showLoading: $message")
    }
}