package com.example.remidialucp2_017.uicontroller.viewmodel

import androidx.lifecycle.ViewModel
import com.example.remidialucp2_017.modeldata.Buku
import com.example.remidialucp2_017.repositori.RepositoriBuku
import com.example.remidialucp2_017.utilitas.StatusUI

class BukuViewModel(
    private val repo: RepositoriBuku
) : ViewModel() {

    var status: StatusUI = StatusUI.Idle
        private set

    fun tambah(buku: Buku) {
        try {
            status = StatusUI.Loading
            repo.tambah(buku)
            status = StatusUI.Sukses("Buku ditambahkan")
        } catch (e: Exception) {
            status = StatusUI.Error(e.message ?: "Gagal")
        }
    }

    fun semua(): List<Buku> = repo.semua()
}
