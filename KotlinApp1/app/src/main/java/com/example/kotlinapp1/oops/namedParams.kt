package com.example.kotlinapp1.oops

class House(val height:Double, val color:String, val price:Int=180000){
    fun print(){
        println("House [height=$height, color=$color, price=$price")
    }
}

fun main(){
    val blueHouse=House(4.5, "Blue", 150000)
    val redHouse=House(price=200000, color="Red", height=5.5)
    val greenHouse=House(4.8,"Green")
    blueHouse.print()
    redHouse.print()
    greenHouse.print()
}