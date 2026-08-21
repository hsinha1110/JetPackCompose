package com.example.jetpackcompose.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 30.sp);
        Text(text = "Banana", fontSize = 30.sp);
        Text(text = "Orange", fontSize = 30.sp)
    }
}


@Composable
fun ColumnExample_01() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Book 01", fontSize = 30.sp)
        Text(text = "Book 02", fontSize = 30.sp)
        Text(text = "Book 03", fontSize = 30.sp)

    }
}


@Composable
fun ColumnExample_02() {
    var name by remember { mutableStateOf(value = "") }
    var email by remember { mutableStateOf(value = "") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login", fontSize = 30.sp);
        Box(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = name,
            onValueChange = {
            },
            placeholder = {
                Text("Enter your name", fontSize = 20.sp)
            }
        )
        Box(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {
            },
            placeholder = {
                Text("Enter your email", fontSize = 20.sp)
            }
        )
        Box(modifier = Modifier.height(20.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(55.dp)
        ) {
            Text(
                text = "Login",
                fontSize = 18.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Text 01",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Box(modifier = Modifier.height(20.dp))

        Text(
            text = "Text 02",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.Center)
        )

        Text(
            text = "Text 03",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}