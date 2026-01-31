package com.example.remidialucp2_017.uicontroller.utilitas

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object UtilTanggal {

    fun format(timestamp: Long): String {
        val sdf = SimpleDateFormat("dd MMM yyyy", Locale("id", "ID"))
        return sdf.format(Date(timestamp))
    }
}
