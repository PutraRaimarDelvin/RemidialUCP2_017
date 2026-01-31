package com.example.remidialucp2_017.repositori

import com.example.remidialucp2_017.modeldata.Buku
import com.example.remidialucp2_017.modeldata.enum.AksiAudit

class RepositoriBuku(
    private val audit: RepositoriAudit
) {
    private val buku = mutableListOf<Buku>()

    fun tambah(b: Buku) {
        buku.add(b)
        audit.catat("Buku", b.id, AksiAudit.INSERT, null, b.toString())
    }

    fun semua(): List<Buku> = buku.filter { !it.isDeleted }
}
