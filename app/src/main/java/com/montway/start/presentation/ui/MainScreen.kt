package com.montway.start.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.montway.start.presentation.theme.StartTheme

@Composable
fun MainScreen(){
    val cardList = listOf(
        "Name","Name","Name","Name","Name","Name","Name","Name","Name","Name"
    )


    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Add, contentDescription = "")
            }
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            modifier = Modifier
                .padding(innerPadding),
            columns = GridCells.Adaptive(minSize = 148.dp)
        ) {
            items(cardList) { item ->
                SampleCard(title = item)
            }

            item { Spacer(modifier = Modifier.height(100.dp)) }
        }
    }
}

@Composable
private fun SampleCard(
    modifier: Modifier = Modifier,
    title: String
) {
    Card(
        modifier = modifier
            .height(200.dp)
            .padding(8.dp)
    ) {
        Box(
            Modifier
                .padding(8.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                style = MaterialTheme.typography.headlineLarge,
                text = title
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StartTheme {
        MainScreen()
    }
}