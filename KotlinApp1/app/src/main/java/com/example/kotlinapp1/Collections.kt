package com.example.kotlinapp1

fun main(args : Array<String>) {
    //arrays
    val array=arrayOf("Texas","Puna","Mumbai") //immutable
    val num= intArrayOf(1,2,3,4)
    val array2=arrayOf("Lonavla","Mysoor")
    val mixArray= array + array2

    //lists
    val list=listOf("Orange","Blue","Green") // immutable

    //arrayLists
    val arrayList= arrayListOf("Jon","Patrick","Lisa") //mutable
    arrayList.add("Meera")
}