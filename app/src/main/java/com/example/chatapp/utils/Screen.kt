package com.example.chatapp.utils

sealed class Screen(val route:String){
    object SplashScreen :Screen("splash_screen")
    object LoginScreen: Screen("login_screen")

}
