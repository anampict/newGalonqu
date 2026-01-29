package com.example.galonqu.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galonqu.R
import com.example.galonqu.commond.plusjakarta

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var value by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier, containerColor = Color.White, topBar = {
            CenterAlignedTopAppBar(
                windowInsets = WindowInsets(0),
                title = {
                    Text(
                        text = "Masuk",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        fontFamily = plusjakarta,
                        color = Color.Black
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Batal",
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )

                    }
                }, colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.White// TopAppBar background
                )
            )

        }, contentWindowInsets = WindowInsets(0)
    ) { innerPadding ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            item {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 38.dp, start = 58.dp, end = 58.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.logoauth),
                        contentScale = ContentScale.FillBounds, contentDescription = ""
                    )
                    Spacer(Modifier.height(16.dp))

                    Text(
                        "Masuk ke GalonQu",
                        fontSize = 24.sp,
                        fontFamily = plusjakarta,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(Modifier.height(16.dp))

                    Text(
                        "Masukkan Nomor HP atau Email Anda untuk\n melanjutkan " +
                                "pemesanan air galon.",
                        fontSize = 14.sp,
                        fontFamily = plusjakarta,
                        fontWeight = FontWeight.Normal, color = Color(0xff6B7280)
                    )

                    Spacer(Modifier.height(38.dp))

                    Text(
                        "Masukkan Nomer Telepon",
                        fontFamily = plusjakarta,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(Modifier.height(8.dp))

                    OutlinedTextField(
                        value = value,
                        onValueChange = { value = it },
                        placeholder = {
                            Text(
                                "Contoh: 08123456789",
                                modifier = Modifier,
                                Color(0xff9CA3AF)
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xFF2563EB),
                            unfocusedBorderColor = Color(0xFFE5E7EB)
                        ),
                        singleLine = true
                    )

                    Spacer(Modifier.height(20.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .width(400.dp)
                            .height(56.dp), shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff13EC49))
                    ) {
                        Text(
                            "MASUK",
                            color = Color.White,
                            fontFamily = plusjakarta,
                            fontWeight = FontWeight.SemiBold
                        )
                    }


                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}