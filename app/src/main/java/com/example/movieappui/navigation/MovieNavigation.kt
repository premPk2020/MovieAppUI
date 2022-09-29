package com.example.movieappui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieappui.navigation.screens.detail.DetailScreen
import com.example.movieappui.navigation.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(MovieScreens.HomeScreen.name){
            HomeScreen(navController)
        }
        composable(MovieScreens.DetailScreen.name+"/{movie}", arguments = listOf(navArgument(name = "movie"){
            type = NavType.StringType
        })){ backStackEntry ->
            DetailScreen(navController = navController, backStackEntry.arguments?.getString("movie") )
        }
    }

}