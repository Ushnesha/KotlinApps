package com.example.kotlinapp1

fun main(args:Array<String>) {
    val num=listOf(6,3,7,2,3,4,9)
    println(reverseList(num))
}

fun reverseList(list: List<Int>) : List<Int>{
    val res= arrayListOf<Int>()
    for(i in list.size-1 downTo 0){
        res.add(list.get(i))
    }
    return res
}