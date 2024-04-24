package com.example.authentification.model.data.Retroift


import com.example.authentification.model.data.LoginRequest
import com.example.authentification.model.data.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>
}