package com.thaariq.oopkotlin.posttest

class Cat {
    // Todo hapus komentar yang salah
    private var mood: Int = 1      // merupakan 'property'
    private var hungry: Int = 0    // merupakan 'property'
    private var energy: Int = 1    // merupakan 'property'

    private fun meow() {
        println("Miaoo,, Meoww,, Miauww")
    }    // merupakan 'function'

    fun sleep() {
        energy++
        hungry++
        println("State of Cat\nMood: $mood\nHungry: $hungry\nEnergy: $energy")
    }    // merupakan 'object'
}

fun main() {
    val gury = Cat()   // merupakan 'function'
//    gury.play()
    gury.sleep()       // merupakan 'function'
//    gury.meow()
}