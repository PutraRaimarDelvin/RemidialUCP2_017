package com.example.remidialucp2_017.modeldata

data class Kategori(
    val id: Long,
    val nama: String,
    val parentId: Long? = null,
    val isDeleted: Boolean = false
)
