package com.app.androidarchetctureapplication.di

import com.app.androidarchetctureapplication.network.ApiService
import com.app.androidarchetctureapplication.presenter.TodoContract
import com.app.androidarchetctureapplication.presenter.TodoPresenter
import com.app.androidarchetctureapplication.ui.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRetrofitService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideMainActivity(activity: MainActivity): TodoContract.View {
        return activity
    }

}