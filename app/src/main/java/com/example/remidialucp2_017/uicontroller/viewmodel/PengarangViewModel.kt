package com.example.remidialucp2_017.uicontroller.viewmodel

import androidx.lifecycle.ViewModel
import com.example.remidialucp2_017.modeldata.Pengarang
import com.example.remidialucp2_017.repositori.RepositoriPengarang

class PengarangViewModel(
    private val repo: RepositoriPengarang
) : ViewModel() {

    fun tambah(p: Pengarang) {
        repo.tambah(p)
    }

    fun semua(): List<Pengarang> = repo.semua()
}
