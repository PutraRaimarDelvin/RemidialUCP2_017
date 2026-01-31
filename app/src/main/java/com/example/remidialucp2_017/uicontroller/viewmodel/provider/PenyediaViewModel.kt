package com.example.remidialucp2_017.uicontroller.viewmodel.provider

import com.example.remidialucp2_017.repositori.RepositoriAudit
import com.example.remidialucp2_017.repositori.RepositoriBuku
import com.example.remidialucp2_017.repositori.RepositoriKategori
import com.example.remidialucp2_017.repositori.RepositoriPengarang
import com.example.remidialucp2_017.uicontroller.viewmodel.BukuViewModel
import com.example.remidialucp2_017.uicontroller.viewmodel.EntryViewModel
import com.example.remidialucp2_017.uicontroller.viewmodel.KategoriViewModel
import com.example.remidialucp2_017.uicontroller.viewmodel.PengarangViewModel

class PenyediaViewModel(
    audit: RepositoriAudit
) {
    val bukuVM = BukuViewModel(RepositoriBuku(audit))
    val kategoriVM = KategoriViewModel(RepositoriKategori(audit))
    val pengarangVM = PengarangViewModel(RepositoriPengarang(audit))
    val entryVM = EntryViewModel()
}