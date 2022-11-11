package com.example.androiddevelopment.tipeFile

fun main() {
    val mobil = Mobil("Xpander Cross M/T", "Mitsubishi Motors", 263000000)

    val mobil2 = mobil.copy("XL7", "Suzuki")

    println(mobil)
    println(mobil2)
}