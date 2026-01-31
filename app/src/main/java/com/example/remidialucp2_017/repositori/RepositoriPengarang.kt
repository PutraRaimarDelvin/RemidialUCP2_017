package com.example.remidialucp2_017.repositori

import com.example.remidialucp2_017.modeldata.Pengarang
import com.example.remidialucp2_017.modeldata.enum.AksiAudit

class RepositoriPengarang(
    private val audit: RepositoriAudit
) {

    private val pengarang = mutableListOf<Pengarang>()

    fun tambah(p: Pengarang) {
        pengarang.add(p)
        audit.catat(
            entity = "Pengarang",
            entityId = p.id,
            aksi = AksiAudit.INSERT,
            sebelum = null,
            sesudah = p.toString()
        )
    }

    fun semua(): List<Pengarang> {
        return pengarang
    }
}
