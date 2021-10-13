package com.thaariq.oopkotlin

open class Person(val name : String,val email : String){
fun info() {
    println(
        "Name : $name \n" +
                "Email : $email")
    }
}

open class Teacher(name: String,email: String,val subject : String) : Person(name, email){
    fun specialSubject(){
        info()
        println("Is a teacher who teaches subject $subject")
    }
}

class PrivateTeacher(name: String, email: String, subject: String, val students : Int)
    :Teacher(name, email, subject){

        fun capacity(){
            specialSubject()
            println("As a private teacher able to teach $students students.")
        }
    }

class PublicTeacher(name: String,email: String,subject: String, val school : String)
    :Teacher(name, email, subject){
        fun school(){
            specialSubject()
            println("Teaching at $school as a public teacher")
        }
    }

fun main() {
    val myTeacher = PrivateTeacher("Yusril","Yusril@gmail.com","Android",5)
    myTeacher.capacity()

    println()

    val myHomeRoom = PublicTeacher("Yusril","Yusril@gmail.com","Android","SMK IDN")
    myHomeRoom.school()

    println()
}