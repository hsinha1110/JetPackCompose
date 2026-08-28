package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.jetpackcompose.jetpackcompose.C9_Navigation.HomeScreen
import com.example.jetpackcompose.jetpackcompose.C9_Navigation.Login
import com.example.jetpackcompose.jetpackcompose.C9_Navigation.MyNavRoutes
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {

    /*
    NavController → navigation control karta hai.
    NavHost → routes/screens define karta hai.
    composable<Route> → particular screen ka route.
    toRoute() → navigation se bheja hua data receive karta hai.
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            JetPackComposeTheme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = MyNavRoutes.LoginScreen
                ) {

                    // Login
                    composable<MyNavRoutes.LoginScreen> {

                        Login(navController)
                    }

                    // Home
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
        }
    }
}