package com.thaariq.oopkotlin.posttest

open class IDN(
    val mata_pelajaran : ArrayList<String>,
    val jam_pelajaran : ArrayList<Int>,
    val pengajar : ArrayList<String>
){
    fun cetak_mp() {
    }
    fun cetak_jp() {
    }
    fun cetak_pengajar() {
    }
}

open class inputData() : IDN(
    arrayListOf("db","web","android","diniyyah","adab","quran hadis","akhlak","tahfidz"),
    arrayListOf(9,10,11,12,13,14,15),
    arrayListOf("adi","nugroho","fusilat","argo","sekar","tanjung","bunga","melati","dea","aini")
){
    fun datamp(){
        cetak_mp()
        cetak_jp()
        cetak_pengajar()
    }
}

open class panggil() : inputData(){
    fun hasil(){
        datamp()
        println("$pengajar mengajar di jam ke $jam_pelajaran pada mata pelajaran $mata_pelajaran")
    }
}



fun main(){
    var hello = panggil()
    hello.hasil()
    }

