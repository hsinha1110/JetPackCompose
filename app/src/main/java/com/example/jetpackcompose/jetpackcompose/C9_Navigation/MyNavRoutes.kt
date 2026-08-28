package com.example.jetpackcompose.jetpackcompose.C9_Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoutes {

    @Serializable
    data object LoginScreen : MyNavRoutes()

    @Serializable
    data class HomeScreen(
        val userEmail: String,
        val password: String
    ) : MyNavRoutes()
}