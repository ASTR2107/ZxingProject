package com.example.authentification.navigation

import LogIn
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.authentification.utils.Constants
import com.example.authentification.viewmodel.BaseActivity
import dagger.hilt.android.lifecycle.HiltViewModel

sealed class Screens(val route: String) {
    data object Splash : Screens(route = Constants.Screens.SPLASH_SCREEN)
    data object Login : Screens(route = Constants.Screens.LOGIN_SCREEN)
    data object Details : Screens(route = Constants.Screens.DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: HiltViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route
    ) {
        composable(route = Screens.Splash.route) {
            SplashScreen(navController = NavController, viewModel = viewModel)
        }
        composable(route = Screens.Login.route) {
            LogIn(navController = navController, viewModel = viewModel)


        }
        composable(route = Screens.Details.route) {

        }

    }

}

private fun AnimatedContentScope.SplashScreen(
    navController: NavController.Companion,
    viewModel: HiltViewModel
) {
    TODO("Not yet implemented")
}
