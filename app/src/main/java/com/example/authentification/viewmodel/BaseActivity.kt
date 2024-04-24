package com.example.authentification.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.authentification.model.data.LoginRequest
import com.example.authentification.model.data.Retroift.AuthApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BaseActivity @Inject constructor(private val authApi: AuthApi) : ViewModel() {

    private val _token = mutableStateOf<String?>(null)
    val token: State<String?> = _token

    fun login(
        username: String, password: String
    ) {
        viewModelScope.launch {
            val reponse =
                authApi.login(
                    LoginRequest(
                        username, password
                    )
                )
            if (reponse.isSuccessful
            ) {
                _token.value = reponse.body()?.token
            }
        }
    }

}
