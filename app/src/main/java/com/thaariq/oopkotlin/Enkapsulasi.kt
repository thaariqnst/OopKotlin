package com.thaariq.oopkotlin

class mahasiswa7 {
    private var name = String()
    fun setNama (nama:String) {
        this.name = nama
    }

    fun getNama(): String = name
}

fun main() {
    val mhs1 = mahasiswa7()
    mhs1.setNama("Okki")

    println("Hai  saya ${mhs1.getNama()} ")
    println()
}