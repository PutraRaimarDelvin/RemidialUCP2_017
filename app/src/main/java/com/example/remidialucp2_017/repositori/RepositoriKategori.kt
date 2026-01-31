package com.example.remidialucp2_017.repositori

import com.example.remidialucp2_017.modeldata.Kategori
import com.example.remidialucp2_017.modeldata.enum.AksiAudit

class RepositoriKategori(
    private val audit: RepositoriAudit
) {
    private val kategori = mutableListOf<Kategori>()
    private val bukuDipinjam = mutableSetOf<Long>()

    fun tambah(k: Kategori) {
        kategori.add(k)
        audit.catat("Kategori", k.id, AksiAudit.INSERT, null, k.toString())
    }

    fun subtree(id: Long): List<Kategori> {
        val hasil = mutableListOf<Kategori>()
        fun dfs(parentId: Long) {
            kategori.filter { it.parentId == parentId && !it.isDeleted }.forEach {
                hasil.add(it)
                dfs(it.id)
            }
        }
        dfs(id)
        return hasil
    }

    fun hapusKategori(id: Long, hapusBuku: Boolean) {
        val subtreeIds = subtree(id).map { it.id } + id

        if (bukuDipinjam.any { subtreeIds.contains(it) }) {
            throw IllegalStateException("Rollback: ada buku dipinjam")
        }

        kategori.replaceAll {
            if (subtreeIds.contains(it.id)) it.copy(isDeleted = true) else it
        }

        audit.catat("Kategori", id, AksiAudit.SOFT_DELETE, "AKTIF", "DELETED")
    }
}
