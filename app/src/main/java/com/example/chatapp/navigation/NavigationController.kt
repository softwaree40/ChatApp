package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.splash.SplashScreen
import com.example.chatapp.utils.Screen

@Composable
fun NavigationController(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route){
        composable(Screen.SplashScreen.route){
            // TODO go to splash screen composable
            SplashScreen(navController = navController)
        }

    }



}