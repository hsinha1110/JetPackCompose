package com.example.jetpackcompose.jetpackcompose.C9_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ) {

        composable<MyNavRoutes.LoginScreen> {
            Login(navController)
        }

        composable<MyNavRoutes.HomeScreen> { backStackEntry ->

            val data =
                backStackEntry.toRoute<MyNavRoutes.HomeScreen>()

            HomeScreen(
                userEmail = data.userEmail,
                password = data.password,
                navController = navController
            )
        }
    }
}