package com.example.androiduppgift2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class appViewModel : ViewModel() {

    var counter by mutableIntStateOf(0)

    var boxColor by mutableStateOf(Color.Gray)

    fun addition() {
        counter += 1
    }

    fun changeColor(color : Color) {
         boxColor = color
    }
}