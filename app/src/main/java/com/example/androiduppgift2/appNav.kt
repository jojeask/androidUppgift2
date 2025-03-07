package com.example.androiduppgift2

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun appNav(appviewmodel : appViewModel = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "start") {
        composable("start") {
            StartScreen(appviewmodel, goColor = {
                navController.navigate("color")
            })
        }
        composable("color") {
            ColorScreen(appviewmodel, navController)
        }
    }
}