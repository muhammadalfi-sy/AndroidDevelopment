package com.example.androiddevelopment.latihanNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen02(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = {
                      navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray,
                contentColor = Color.White
            )
        ) {
            Text(text = "Halo Penghuni")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen02Preview() {
    Screen02(rememberNavController())
}