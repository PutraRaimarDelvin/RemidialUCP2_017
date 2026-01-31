package com.example.remidialucp2_017.modeldata

import com.example.remidialucp2_017.modeldata.enum.StatusBuku

data class BukuFisik(
    val id: Long,
    val bukuId: Long,
    val kodeAset: String,
    val status: StatusBuku
)
