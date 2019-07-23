package com.example.kotlinapp1.oops

class Person(var name:String, var age:Int){

    //constructors
    init{
        println("Object created")
    }



    //member function
    fun speak(){
        println("Hello")
    }

    fun greet(){
        println("Hello ${this.name}")
    }

    fun getBirthYear() = 2019-age;
}

fun main() {
    val person= Person("Ush", 22)
    println(person.name)
    println(person.age)
    person.speak()
    person.greet()
    println(person.getBirthYear())
}