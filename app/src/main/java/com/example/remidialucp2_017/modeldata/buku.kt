package com.example.remidialucp2_017.modeldata

data class Buku(
    val id: Long,
    val judul: String,
    val kategoriId: Long? = null,
    val isDeleted: Boolean = false
)
