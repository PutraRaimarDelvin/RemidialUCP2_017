package com.example.remidialucp2_017.uicontroller.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HalamanEntry(
    keBuku: () -> Unit = {},
    keKategori: () -> Unit = {},
    kePengarang: () -> Unit = {}
) {
    Scaffold(
        topBar = { KomponenTopBar("Manajemen Buku") }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = keBuku) {
                Text("Daftar Buku")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = keKategori) {
                Text("Kategori")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = kePengarang) {
                Text("Pengarang")
            }
        }
    }
}
