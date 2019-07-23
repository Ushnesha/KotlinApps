package com.example.kotlinapp1.oops

import com.example.kotlinapp1.getCurrentDate


interface Drivable{
    fun Drive()
}

interface Buildable{
    val timeReq: Int
    fun build()
}

class Car(val color:Colors):Drivable,Buildable{
    override val timeReq=120
    override fun build() {
        println("Building $color car in time $timeReq")
    }

    override fun Drive() {
        println("Driving Car...")
    }
}

class Motorcycle(val color:Colors):Drivable{
    override fun Drive(){
        println("Driving motorcycle..")
    }
}

fun main() {
    val car=Car(Colors.RED)
    car.Drive()
    car.build()
    val motorcycle=Motorcycle(Colors.BLUE)
    motorcycle.Drive()
    println(getCurrentDate())
    println(0x34)
    println(0b101101)

}

