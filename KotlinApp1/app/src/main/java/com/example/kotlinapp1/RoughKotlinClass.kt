package com.example.kotlinapp1

import java.util.*

fun main(args: Array<String>){
    println("Hello, Ushnesha! Welcome to Kotlin")
    val i=8
    when(i){
        1-> println("The mode is lazy.")
        2->println("The mode is on.")
        3->println("The mode is super productive")
        else->println("Unspecified mode")
    }
    var j=1
    while(j in 1..5){
        rng()
        j++
    }
}
fun rng(){
    val rand= Random().nextInt(50)+1
    when(rand){
        in 1..10->println("The number is between 1 and 10")
        in 11..20->println("The number is between 11 and 20")
        in 21..30->println("The number is between 21 and 30")
        in 31..40->println("The number is between 31 and 40")
        in 41..50->println("The number is between 41 and 50")
    }
    println(rand)
}