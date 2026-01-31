package com.example.remidialucp2_017.uicontroller.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.remidialucp2_017.modeldata.Buku

@Composable
fun HalamanDaftarBuku(
    daftarBuku: List<Buku>,
    tambahBuku: () -> Unit = {}
) {
    Scaffold(
        topBar = { KomponenTopBar("Daftar Buku") },
        floatingActionButton = {
            FloatingActionButton(onClick = tambahBuku) {
                Text("+")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(daftarBuku) { buku ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp)
                    ) {
                        Text(
                            text = buku.judul,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "Kategori ID: ${buku.kategoriId ?: "Tanpa Kategori"}"
                        )
                    }
                }
            }
        }
    }
}
