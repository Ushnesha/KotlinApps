package com.example.kotlinapp1.io

import java.io.File

fun main() {
    var lineNum=0;
    File("io/inputfile.txt").forEachLine {
        ++lineNum
        println("#$lineNum: $it")
    }
}