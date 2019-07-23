package com.example.kotlinapp1.oops

// DRY= Don't Repeat Yourself
//to make stack class as generic class
//varargs are a very convenient way to put in multiple elements of the same type
class Stack<E>(vararg val items: E){

    val elements=items.toMutableList()

    fun push(element:E){
        elements.add(element)
    }

    fun pop():E?{
        if(!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty():Boolean{
        return elements.isEmpty()
    }
}


//generic function
fun <T> stackOf(vararg elements:T):Stack<T>{
    return Stack(*elements)
}

fun main() {
    val stk=Stack<Int>()
    stk.push(3)
    stk.push(5)
    stk.push(6)
    stk.push(8)
    println(stk.pop())
    println(stk.pop())
    println(stk.pop())
    println(stk.pop())

    val stack2= stackOf("Hello", "There", "Ushnesha")
    for(i in 1..3){
        println(stack2.pop())
    }

}