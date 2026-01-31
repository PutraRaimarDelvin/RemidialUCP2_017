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
import com.example.remidialucp2_017.modeldata.Pengarang

@Composable
fun HalamanPengarang(
    daftarPengarang: List<Pengarang>
) {
    Scaffold(
        topBar = { KomponenTopBar("Pengarang") }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(daftarPengarang) { p ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = p.nama,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
