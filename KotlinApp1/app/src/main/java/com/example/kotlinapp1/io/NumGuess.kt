package com.example.kotlinapp1.io

import java.util.*

fun main() {
    val rand= Random().nextInt(100)+1
    var input:String?
    var guess=-1
    while(guess!=rand){
        print("Guess a number between 1 to 100: ")
        input= readLine()

        if(input!=null){
            //can throw Num,berFormatException
            guess=input.toInt()
        }
        if(guess<rand){
            println("Too Low")
        }else if(guess>rand){
            println("Too Large")
        }else{
            println("You Win")
        }
    }
}