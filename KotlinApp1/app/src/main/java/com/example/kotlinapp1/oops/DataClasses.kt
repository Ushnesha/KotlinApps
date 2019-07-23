package com.example.kotlinapp1.oops

class Book(val title:String, val author:String, val pubYear:Int, val price:Double){
    override fun toString():String{
        return "Book[title=$title, author=$author, pubYear=$pubYear, price=$price]"
    }
}
data class DataBook(val title:String, val author:String, val pubYear:Int, val price:Double){

}

fun main() {

    //book and book2 are referring to same object
    val book=Book("XYZ","RGT", 2019, 67.85)
    val book2=Book("XYZ","RGT", 2019, 67.85)
   //calling toString() internally
    println(book)
    println(book.equals(book2))

    //databook and databook2 are referring two different objects
    val databook=DataBook("XYZ","RGT", 2019, 67.85)
    val databook2=DataBook("XYZ","RGT", 2019, 67.85)
    val databook3=databook.copy(price=46.98)
    println(databook)
    println(databook3)
    println(databook.equals(databook2))

    //decompose a data object
    var(title,author,pubYr,price)=databook
    println(title+" "+ author+" "+price)
}