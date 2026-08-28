package com.example.jetpackcompose.jetpackcompose

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DividerExample() {

    Column(
        modifier = Modifier
            .padding(40.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//        Text("Profile")
//        HorizontalDivider(modifier = Modifier.height(3.dp), color = Color.LightGray)
//        Text("Settings")
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Profile", fontSize = 20.sp)

            VerticalDivider(
                modifier = Modifier
                    .height(30.dp)
                    .padding(horizontal = 10.dp),
                thickness = 1.dp,
                color = Color.LightGray
            )

            Text("Settings", fontSize = 20.sp)
        }


    }

}