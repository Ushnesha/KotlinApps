package com.example.kotlinapp1.oops

open class Persons(open val name:String,open val age:Int){

    fun speak(){
        println("Hello")
    }

    fun greet(){
        println("Hello ${this.name}")
    }

    fun getBirthYear() = 2019-age;

}

class Student(override val name:String,override val  age:Int): Persons(name,age){

}

class Employee(name:String, age:Int): Persons(name,age){

}

fun main(){
    val stud=Student("Ram", 30)
    stud.greet()
    val emp=Employee("Mohan", 45)
    println(emp.getBirthYear())
}