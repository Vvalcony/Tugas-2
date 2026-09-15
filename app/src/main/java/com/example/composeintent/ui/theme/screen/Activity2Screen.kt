package com.example.composeintent.screen

import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun activity2Screen() {
    val context = LocalActivity.current!!

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val intent = context.intent
        val bundle = intent.extras
        val data1 = bundle?.getString("data1")

        Text(text = "$data1")

        Text(text = "NIM: 245150407111070")
        Text(text = "Nama: Faliha Auliya")

        Button(onClick = { context.finish() }) {
            Text(text = "BACK")
        }
    }
}

@Composable
@Preview
fun activity2Preview() {
    activity2Screen()
}