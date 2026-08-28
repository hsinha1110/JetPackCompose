package com.example.jetpackcompose.jetpackcompose.C9_Navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Login(navController: NavHostController) {

    var userEmail by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        // Email
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),

            value = userEmail,

            onValueChange = {
                userEmail = it
            },

            placeholder = {
                Text("Enter Email")
            }
        )

        // Password
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),

            value = password,

            onValueChange = {
                password = it
            },

            placeholder = {
                Text("Enter Password")
            },

            visualTransformation = PasswordVisualTransformation()
        )

        // Login Button
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black
            ),

            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .height(50.dp),

            shape = RoundedCornerShape(30.dp),

            onClick = {

                if (
                    userEmail.isNotEmpty() &&
                    password.isNotEmpty()
                ) {

                    navController.navigate(
                        MyNavRoutes.HomeScreen(
                            userEmail = userEmail,
                            password = password
                        )
                    )
                }
            }
        ) {

            Text(
                text = "Login",
                fontSize = 20.sp
            )
        }
    }
}