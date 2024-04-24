package com.example.authentification.model.data.Retroift

import androidx.activity.ComponentActivity
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class InitRetrofit(): ComponentActivity(){

    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient())
        .build()

    val authApi = retrofit.create(AuthApi::class.java)

}