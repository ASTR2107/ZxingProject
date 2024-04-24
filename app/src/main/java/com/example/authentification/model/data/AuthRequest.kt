package com.example.authentification.model.data

data class LoginRequest(
    val username: String,
    val password: String
)

data class LoginResponse(
    val token: String
)
