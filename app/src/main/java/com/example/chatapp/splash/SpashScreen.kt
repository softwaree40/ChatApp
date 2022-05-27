package com.example.chatapp.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.chatapp.R


@Composable
fun SplashScreen(
    navController: NavController
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
          painter = painterResource(id = R.drawable.programmer)
          ,contentDescription = "Image Logo"
      )
    }
    
}