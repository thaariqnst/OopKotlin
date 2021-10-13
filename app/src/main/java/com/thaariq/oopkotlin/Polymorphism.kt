package com.thaariq.oopkotlin

open class AnimalSound{
    open fun sound(){
        println("Berbagai macam suara binatang : ")
    }
}

class Dog : AnimalSound(){
    override fun sound(){
        println("Suara Anjing : Yubi Yubi")
    }
}

class Cat : AnimalSound(){
    override fun sound() {
        println("Suara Kucing : Mogu Mogu")
    }
}

fun main() {
    val hewan = AnimalSound()
    val anjing = Dog()
    val kucing = Cat()

    hewan.sound()
    anjing.sound()
    kucing.sound()

}