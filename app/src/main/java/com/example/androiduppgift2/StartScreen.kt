package com.example.androiduppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StartScreen(appviewmodel : appViewModel ,goColor : () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text("${appviewmodel.counter}", fontSize = 48.sp)

        Button(
            onClick = {
                appviewmodel.addition()
        }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray,
            contentColor = Color.Black),
            modifier = Modifier.size(height = 150.dp, width = 300.dp)
                .padding(vertical = 25.dp)
        ) {
            Text("Plus")
        }


        Button(onClick = {
            goColor()
            appviewmodel.changeColor(Color.Red)
        }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.Black),
            modifier = Modifier.size(height = 150.dp, width = 300.dp)
                .padding(vertical = 20.dp)
        ) {
            Text("Röd")
        }

        Button(onClick = {
            goColor()
            appviewmodel.changeColor(Color.Green)
        }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green,
            contentColor = Color.Black),
            modifier = Modifier.size(height = 150.dp, width = 300.dp)
                .padding(vertical = 20.dp)
        ) {
            Text("Grön")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    StartScreen(goColor = {}, appviewmodel = viewModel())
}