package com.example.androiddevelopment.latihanNavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevelopment.R

@Composable
fun Screen01(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.aos),
            contentDescription = "Logo AOS",
            modifier = Modifier
                .border(2.dp, Color.Black, CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(NavRoute.screen_dua.name)
            }) {
            Text(text = "Welcome to AOS App")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Screen01Preview() {
    Screen01(rememberNavController())
}