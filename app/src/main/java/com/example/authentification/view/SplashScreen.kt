package com.example.authentification.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.authentification.navigation.Screens
import com.example.authentification.viewmodel.BaseActivity
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController, viewModel: BaseActivity) {
    var startAnimate by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(key1 = true) {
        startAnimate = true
        delay(4000)
        navController.navigate(Screens.Login.route)
    }

    Splash()
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(150.dp),
            imageVector = Icons.Default.Send,
            contentDescription = "",
            tint = Color.Black
        )
    }
}