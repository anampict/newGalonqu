package com.example.galonqu.screen.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.galonqu.R

@Composable
fun SplashScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xff03AC0E)), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )


    }

}

@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    SplashScreen()

}