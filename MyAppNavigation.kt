package com.example.firebase

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebase.pages.HomePage
import com.example.firebase.pages.LoginPage
import com.example.firebase.pages.SignUp
import com.example.firebase.pages.LanguageGamePage
import com.example.firebase.pages.OutlinesGamePage
import com.example.firebase.pages.PatchesGamePage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(modifier, navController, authViewModel)
        }
        composable("Home") {
            HomePage(modifier, navController, authViewModel)
        }
        composable("SignUp") {
            SignUp(modifier, navController, authViewModel)
        }
        composable("LanguageGame") {
            LanguageGamePage(modifier)
        }
        composable("OutlinesGame") {
            OutlinesGamePage(modifier)
        }
        composable("PatchesGame") {
            PatchesGamePage(modifier)
        }
    }
}
