package com.example.androiddevelopment

import android.media.Image
import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class HaloMahasiswa : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val warnaCream = 0xffecb979
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
            ) {
                androidx.compose.foundation.Image(
                    painter = painterResource(id = R.drawable.logo_mph_himatel),
                    contentDescription = "Gambar Logo Himatel"
                )
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Halo Mahasiswa Polban",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(8.dp,12.dp,12.dp,8.dp),
                        color = Color(warnaCream),
                        textAlign = TextAlign.Center
                    )
                }
                Surface(
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Halo Mahasiswa Luar Polban",
                        color = Color.White,
                        modifier = Modifier.padding(8.dp,10.dp,10.dp,8.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}