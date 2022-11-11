package com.example.androiddevelopment.tipeFile

enum class Gender(val deskripsi: String) {
    Male("Laki-laki"),
    Female("Perempuan");

    fun tampilDeskripsi() {
        println(deskripsi)
    }
}