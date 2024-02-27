package com.example.lab2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ButtonCLick() {
    val backgroundColor = remember {
        mutableStateOf(Color.Red)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                if (backgroundColor.value == Color.Red) {
                    backgroundColor.value = Color.Green
                } else {
                    backgroundColor.value = Color.Red
                }
            }, colors = ButtonDefaults.buttonColors(backgroundColor.value)
        ) {
            Text(text = "Click Me")
        }
    }
}