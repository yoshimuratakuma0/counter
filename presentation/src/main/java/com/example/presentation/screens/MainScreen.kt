package com.example.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.presentation.viewmodels.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {
    val counter = viewModel.counter.collectAsState()
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                content = {
                    Icon(Icons.Default.Add, contentDescription = null)
                },
                onClick = {
                    viewModel.onClickIncrementer()
                }
            )
        },
        content = { padding ->
            Box(
                modifier = Modifier.padding(padding)
            ) {
                Text(
                    text = counter.value.toString()
                )
            }
        },
    )
}