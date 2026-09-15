package com.example.composeintent.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeintent.Activity2

@Composable
fun mainScreen() {
    val context = LocalContext.current
    var teksInput by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(all = 24.dp)
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Text(text = "NIM: 245150407111070")
        Text(text = "Nama: Faliha Auliya")

        OutlinedTextField(
            value = teksInput,
            onValueChange = { teksInput = it },
            label = { Text("Masukkan text di sini") },
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )

        Button(onClick = {
            val intent = Intent(context, Activity2::class.java)
            intent.putExtra("data1", teksInput)
            context.startActivity(intent)
        }) { Text(text = "Lanjut") }
    }
}

@Composable
@Preview
fun mainPreview() {
    mainScreen()
}