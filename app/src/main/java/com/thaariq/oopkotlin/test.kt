package com.thaariq.oopkotlin
//==========yang didalam () adalah constructor, dan diisi nilai untuk default
/*class Hewan(val nama : String, val berat : Float, val berbulu : val Boolean, val umur : Int)*/
//jika menggunakan "val" tidak bisa pakai init
class Hewan(nama : String, berat : Float, berbulu : Boolean) {

    val nama : String
    val berat : Float
    val berbulu : Boolean

//init jarang dipakai
    init {
        this.nama = nama
        this.berat = if (berat <= 0) 0.1F else berat
        this.berbulu = berbulu

    }

    constructor(nama: String, berat: Float, berbulu: Boolean, umur : Int) : this(nama, berat, berbulu)

    fun makan(){ println("$nama sedang makan untuk menambah berat badannya yaitu $berat kg")}
    fun tidur(){ println("$nama sedang tidur untuk merawat bulunya yang $berbulu berbulu")}

    fun info(){ println("Nama : $nama \n" +
            "Berat : $berat \n" +
            "Berbulu : $berbulu \n")}
}


fun main() {

    val anjing = Hewan("Korone", 20.5f,true,)
    anjing.makan()

    val neko = Hewan("Okayu", 4.0f, false,16)
    neko.makan()

    val kucing = Hewan("Kucing", 12F, true, )
    kucing.makan()
    kucing.info()

    val ikan = Hewan("Ikan",0F,false,)
    ikan.makan()
    ikan.info()
}
