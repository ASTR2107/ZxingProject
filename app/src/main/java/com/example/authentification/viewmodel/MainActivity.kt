package com.example.authentification.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.authentification.navigation.SetupNavHost
import com.example.authentification.ui.theme.AuthentificationTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlin.reflect.KProperty


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AuthentificationTheme {
                val navController = rememberNavController()
                val baseActivity: BaseActivity = hilt
                SetupNavHost(navController = navController, viewModel = baseActivity)
            }
        }
    }

}



