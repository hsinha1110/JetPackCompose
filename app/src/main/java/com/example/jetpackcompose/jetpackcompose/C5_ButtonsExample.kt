package com.example.jetpackcompose.jetpackcompose

import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip

@Composable
fun ButtonsExample() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), shape = RoundedCornerShape(8.dp), onClick = {
                Toast.makeText(
                    context,
                    "Button Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
            Text("Button")
        }
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), shape = RoundedCornerShape(8.dp), onClick = {
                Toast.makeText(context, "Outlined Click", Toast.LENGTH_LONG).show()
            }) {
            Text("Outlined Button")
        }
        TextButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), onClick = {
                Toast.makeText(context, "TextButton Clicked", Toast.LENGTH_LONG).show();
            }) {
            Text("TextButton")
        }
        Button(
            onClick = {
                Toast.makeText(context, "Icon Button Clicked!", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Blue,
                containerColor = Color.LightGray
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 20.dp
            ),
            border = BorderStroke(2.dp, Color.Blue)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person"
                )

                Spacer(modifier = Modifier.width(16.dp))

                Text(text = "Click me")
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(40.dp),
                        tint = Color.Gray
                    )
                }
                Spacer(
                    modifier = Modifier.width(16.dp)
                )

                // Card Content
                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Text(
                        text = "Neat Roots",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Black
                    )

                    Spacer(
                        modifier = Modifier.height(6.dp)
                    )

                    Text(
                        text = "The most subscribed YouTube channel for Android Development!"
                    )
                }
            }

        }


    }
}