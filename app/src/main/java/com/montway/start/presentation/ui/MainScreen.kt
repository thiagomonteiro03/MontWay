package com.montway.start.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.montway.start.presentation.theme.StartTheme
import kotlinx.coroutines.launch

@Composable
fun MainScreen(
    homeViewModel: HomeViewModel = hiltViewModel()
){
    val scope = rememberCoroutineScope()

    var login by homeViewModel.login
    var password by homeViewModel.password

    val uiState = homeViewModel.uiState.collectAsState()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when(val state = uiState.value){
                    HomeViewModel.UiState.Empty -> {
                        Text(
                            text = "Make your login of your application"
                        )

                        OutlinedTextField(
                            value = login,
                            label = {
                                Text(text = "User")
                            },
                            onValueChange = {
                                login = it
                            })
                        OutlinedTextField(
                            value = password,
                            label = {
                                Text(text = "Password")
                            },
                            onValueChange = {
                                password = it
                            })

                        Button(
                            modifier = Modifier.padding(8.dp),
                            onClick = {
                                scope.launch {
                                    homeViewModel.makeLogin(
                                        login = login,
                                        password = password
                                    )
                                }
                            }
                        ) {
                            Text(text = "Login")
                        }
                    }
                    HomeViewModel.UiState.Loading -> {
                        CircularProgressIndicator()
                    }
                    HomeViewModel.UiState.Error -> {
                        Text(text = "Something error happen")
                    }
                    is HomeViewModel.UiState.Success -> {
                        Text(text = "Login at ${state.user.name} is successful!")

                        Button(
                            modifier = Modifier.padding(8.dp),
                            onClick = {
                                scope.launch {
                                    homeViewModel.backToLogin()
                                }
                            }
                        ) {
                            Text(text = "Back")
                        }
                    }
                }

            }


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