package com.thaariq.oopkotlin

abstract class Computer(){
    abstract fun operatingSystem() : String  //abstraction tidak bisa menggunakan body dlm funtion
}

class Windows() : Computer(){
    override fun operatingSystem(): String {
        return "Windows"
    }
}

class Mac() : Computer(){
    override fun operatingSystem(): String {
        return  "Mac"
    }
}

fun getOperatingSystem(computer: Computer) = computer.operatingSystem()

fun main() {
    val windows = Windows()
    val mac = Mac()
    println(getOperatingSystem(windows))
    println(getOperatingSystem(mac))
}