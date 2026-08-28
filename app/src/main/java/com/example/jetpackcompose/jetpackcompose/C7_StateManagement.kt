package com.example.jetpackcompose.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StateManagementExample() {
    var count = remember {
        mutableStateOf(0)
    }

    // remember keeps this value during recomposition
    // mutableStateOf holds a value that can change
    // & triggers recomposition when the value changes

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    count.value++
                }
            ) {
                Text("Increment")
            }

            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = "${count.value}", fontSize = 25.sp
            )

            Button(
                modifier = Modifier.weight(1f), enabled = count.value > 0,
                onClick = {
                    if (count.value > 0) {

                        count.value--
                    }
                }
            ) {
                Text("Decrement")
            }
        }
    }
}

@Composable
fun RememberSaveableExample() {
    var count = rememberSaveable() {
        mutableStateOf(0)
    }

    // remember keeps this value during recomposition
    // mutableStateOf holds a value that can change
    // & triggers recomposition when the value changes

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    count.value++
                }
            ) {
                Text("Increment")
            }

            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = "${count.value}", fontSize = 25.sp
            )

            Button(
                modifier = Modifier.weight(1f), enabled = count.value > 0,
                onClick = {
                    if (count.value > 0) {

                        count.value--
                    }
                }
            ) {
                Text("Decrement")
            }
        }
    }
}

// Parent StateHoistingExample -> Send value to Child CounterButton
// Parent -> owns count state
// Parent -> sends onIncrement event to Child
@Preview(showBackground = true, showSystemUi = true)
@Composable()
fun StateHoistingExample() {
    var count by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Count: $count")

        CounterButton(
            onIncrement = {
                count++
            }
        )
    }
}

@Composable
fun CounterButton(
    onIncrement: () -> Unit
) {

    Button(
        onClick = {
            onIncrement()
        }
    ) {
        Text("Increment")
    }
}
