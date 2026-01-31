package com.example.remidialucp2_017.uicontroller.utilitas

object Validator {

    fun tidakKosong(value: String, field: String) {
        if (value.isBlank()) {
            throw IllegalArgumentException("$field tidak boleh kosong")
        }
    }

    fun panjangMinimal(value: String, min: Int, field: String) {
        if (value.length < min) {
            throw IllegalArgumentException("$field minimal $min karakter")
        }
    }
}
