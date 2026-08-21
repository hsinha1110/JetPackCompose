package com.example.jetpackcompose.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextExample() {
    Text(
        text = "Hello Kotlin Development",
        color = Color.Red,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf("") }
    var isFocused by remember { mutableStateOf(false) }

    TextField(
        value = name,
        onValueChange = {
            name = it
        },
        placeholder = {
            Text("Enter your email")
        },
        leadingIcon = {
            Text("*")
        },
        trailingIcon = {
            Text("#")
        },
        singleLine = true,
        label = {
            Text("Email")
        },
        shape = CircleShape,

        modifier = Modifier.onFocusChanged {
            isFocused = it.isFocused
        },

        colors = TextFieldDefaults.colors(
            focusedTextColor = if (isFocused) Color.Red else Color.Black,
            unfocusedTextColor = Color.Black,

            focusedLabelColor = if (isFocused) Color.Red else Color.Gray,
            unfocusedLabelColor = Color.Gray,

            focusedIndicatorColor = if (isFocused) Color.Red else Color.Gray,
            unfocusedIndicatorColor = Color.Gray
        )
    )
}