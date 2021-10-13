package com.thaariq.oopkotlin

class Human() {
    //properties
    var nama = "Faiq"
    var mata = "normal"
    var mulut = true
    var telinga = 2
    var tangan : String = "kuat"
    var kaki : Int = 2

    //function
    fun melihat(){ println("$nama melihat dengan mata $mata") }
    fun berbicara(){ println("$nama memiliki mulut, apakah benar? $mulut") }
    fun mendengar(){ println("$nama memiliki $telinga telinga")}
    fun lengan(){ println("tangan $nama sedang tidak $tangan alias PATAH") }
    fun berjalan(){ println("$nama masih bisa berjalan dengan $kaki kakinya") }
}

fun main() {
  val pig = Human()

    pig.nama = "paig"
    pig.mata = "buta sebelah"
    pig.mulut = false
    pig.telinga = 22
    pig.tangan = "PATAH"
    pig.kaki = 1

    val orang = Human()
    orang.melihat()
    orang.berbicara()
    orang.mendengar()
    orang.lengan()
    orang.berjalan()

    println(pig.nama)
}