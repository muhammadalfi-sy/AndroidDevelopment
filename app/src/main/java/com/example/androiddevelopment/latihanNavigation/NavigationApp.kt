package com.example.androiddevelopment.latihanNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/* Metode navController biasa
@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "screen_satu"
    ) {
        composable("screen_satu") {
            Screen01(navController)
        }
        composable("screen_dua") {
            Screen02(navController)
        }
    }
}*/

// Metode navController navRoute
@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoute.screen_satu.name
    ) {
        composable(NavRoute.screen_satu.name) {
            Screen01(navController)
        }
        composable(NavRoute.screen_dua.name) {
            Screen02(navController)
        }
    }
}