package com.example.jetpackcompose.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun ImageExample() {
    Image(
        painter = painterResource(R.drawable.green_grass),
        contentDescription = "Image of green grass",
        modifier = Modifier
            .padding(16.dp)
            .size(
                width = 200.dp,
                height = 200.dp
            )
            .clip(RoundedCornerShape(30.dp)),
        alignment = Alignment.Center,
        contentScale = ContentScale.FillBounds
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
            modifier = Modifier.size(80.dp),
            tint = Color.Red
        )
    }
}