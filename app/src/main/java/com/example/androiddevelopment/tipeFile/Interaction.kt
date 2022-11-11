package com.example.androiddevelopment.tipeFile

interface Interaction {
    val name: String
    fun sayHai(name: String)
}

class Human(override val name: String) : Interaction {
    override fun sayHai(name: String) {
        println("Hai $name, my name is ${this.name}")
    }
}