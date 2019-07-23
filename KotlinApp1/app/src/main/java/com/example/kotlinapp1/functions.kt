package com.example.kotlinapp1

import com.example.kotlinapp1.oops.Persons
import java.util.*

fun helloworld(){
    println("Hello Ushnesha")
}

fun printWithSpace(text:String){
    for(char in text){
        print(char+" ")
    }
    println()
}

fun getCurrentDate() : Date {
    return Date()
}

fun max(a:Int, b: Int) : Int{
    if(a>b) return a
    else return b
}

fun main(args: Array<String>) {
    helloworld()
    printWithSpace("Ushnesha")
    println(getCurrentDate())
    println(max(4,9))
    val per=Persons("Ram",65)
    println(per.name+" "+per.age)
}