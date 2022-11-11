package com.example.androiddevelopment.tipeFile

fun main() {
    val pria = Gender.Male
    val wanita = Gender.Female
    val allGenders: Array<Gender> = Gender.values()

    println(pria)
    println(wanita)
    println(allGenders.toList())

    println(pria.tampilDeskripsi())
    println(wanita.tampilDeskripsi())
}