package com.example.remidialucp2_017.uicontroller.viewmodel

import androidx.lifecycle.ViewModel
import com.example.remidialucp2_017.repositori.RepositoriKategori
import com.example.remidialucp2_017.utilitas.StatusUI

class KategoriViewModel(
    private val repo: RepositoriKategori
) : ViewModel() {

    var status: StatusUI = StatusUI.Idle
        private set

    fun hapus(id: Long) {
        try {
            status = StatusUI.Loading
            repo.hapusKategori(id, true)
            status = StatusUI.Sukses("Kategori dihapus")
        } catch (e: Exception) {
            status = StatusUI.Error(e.message ?: "Rollback terjadi")
        }
    }
}
