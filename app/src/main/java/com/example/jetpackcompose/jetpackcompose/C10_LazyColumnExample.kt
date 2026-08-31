package com.example.jetpackcompose.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnExample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight().padding(vertical = 50.dp)
    ) {
        items(20) { index ->
            Spacer(
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "Item $index",
                color = Color.Black,
                textAlign = TextAlign.Center,
            )
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(15) { index ->
                    Text(
                        text = "Item $index",
                        modifier = Modifier
                            .background(Color.Gray)
                            .padding(10.dp)
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TypesOfItem() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        // 01 - item
        LazyColumn() {
            item { Text(text = "Header") }
        }

        // 02 - items(count)
        LazyColumn() {
            items(10) { index ->
                Text("Item $index")
            }

        }

        // 03 - items(list)
        val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")
        LazyColumn() {
            items(names) { name ->
                Text(name)
            }

        }

        // 04 - itemsIndexed(list)
        LazyColumn() {
            itemsIndexed(names) { index, name ->
                Text(text = "Name: $name, Index: $index")
            }

        }

    }

}