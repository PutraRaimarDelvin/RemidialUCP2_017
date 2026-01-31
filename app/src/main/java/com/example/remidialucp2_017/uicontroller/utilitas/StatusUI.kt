package com.example.remidialucp2_017.uicontroller.utilitas

sealed class StatusUI {
    object Idle : StatusUI()
    object Loading : StatusUI()
    data class Error(val msg: String) : StatusUI()
    data class Sukses(val msg: String) : StatusUI()
}
