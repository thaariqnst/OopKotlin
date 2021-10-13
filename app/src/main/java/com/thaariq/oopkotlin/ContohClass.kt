package com.thaariq.oopkotlin

//class merupakan sebuah blueprint yang terdapat properti dari fungsi di dalamnya

class Animal(
    //property ; merupakan karakteristik dari sebuah kelas dan memiliki tipe data
              val name : String,
              val weight : Double,
              val age : Int,
              val isMammal : Boolean
){
    //function ; kemampuan atau aksi dari sebuah class
    var color = "Putih"
    fun eat(){
        println("$name makan")
    }
    fun sleep(){
        println("$name tidur")
    }
}

fun main() {

    val Gerin = Animal("Gharyn", 69.0, 16, false)
    val Lukman = Animal("Lukman", 7.0, 69, true)
    val Jeki = Animal("Jeki", 340.9, 1, true)

  /*  println("Nama : ${Gerin.name},"+
            "Berat : ${Gerin.weight},"
    )*/
    Gerin.color ="Hitam"
    println("Gerin warnanya ${Gerin.color}")

}

