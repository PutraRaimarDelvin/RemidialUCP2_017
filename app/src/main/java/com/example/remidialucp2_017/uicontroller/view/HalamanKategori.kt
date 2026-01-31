package com.example.remidialucp2_017.uicontroller.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.remidialucp2_017.modeldata.Kategori

@Composable
fun HalamanKategori(
    daftarKategori: List<Kategori>
) {
    Scaffold(
        topBar = { KomponenTopBar("Kategori Buku") }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(daftarKategori) { kategori ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = kategori.nama,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
