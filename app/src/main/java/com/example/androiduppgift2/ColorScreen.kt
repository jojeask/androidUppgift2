package com.example.androiduppgift2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ColorScreen(appviewmodel : appViewModel, navController : NavController) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text("${appviewmodel.counter}",
            fontSize = 48.sp,
            modifier = Modifier
                .padding(bottom = 20.dp))

        Box(modifier = Modifier
            .background(appviewmodel.boxColor)
            .height(300.dp)
            .width(300.dp))

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ColorScreenPreview() {
    ColorScreen(appviewmodel = viewModel(), navController = rememberNavController())
}