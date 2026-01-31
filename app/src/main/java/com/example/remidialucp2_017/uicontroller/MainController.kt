package com.example.remidialucp2_017.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.remidialucp2_017.uicontroller.route.DestinasiBuku
import com.example.remidialucp2_017.uicontroller.route.DestinasiEntry
import com.example.remidialucp2_017.uicontroller.route.DestinasiKategori
import com.example.remidialucp2_017.uicontroller.view.HalamanDaftarBuku
import com.example.remidialucp2_017.uicontroller.view.HalamanEntry
import com.example.remidialucp2_017.uicontroller.view.HalamanFormBuku
import com.example.remidialucp2_017.uicontroller.view.HalamanKategori
import com.example.remidialucp2_017.uicontroller.view.HalamanPengarang

@Composable
fun MainController(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiEntry.route
    ) {

        composable(DestinasiEntry.route) {
            HalamanEntry(
                keBuku = { navController.navigate(DestinasiBuku.route) },
                keKategori = { navController.navigate(DestinasiKategori.route) },
                kePengarang = { navController.navigate("pengarang") }
            )
        }

        composable(DestinasiBuku.route) {
            HalamanDaftarBuku(
                daftarBuku = emptyList(),
                tambahBuku = {
                    navController.navigate("form_buku")
                }
            )
        }

        composable("form_buku") {
            HalamanFormBuku(
                simpan = {
                    navController.popBackStack()
                }
            )
        }

        composable(DestinasiKategori.route) {
            HalamanKategori(
                daftarKategori = emptyList()
            )
        }

        composable("pengarang") {
            HalamanPengarang(
                daftarPengarang = emptyList()
            )
        }
    }
}
