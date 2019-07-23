package com.example.kotlinapp1.oops

abstract class Course(val topic:String, val price:Double){
    open fun learn(){
        println("Learning $topic course")
    }
}

interface learnable{
    fun learn(){
        println("Learning...")
    }
}

open class KotlinCourse():Course("Kotlin", 1000.90),learnable{
    //overriding of the function has stopped
    override final fun learn() {
        super<learnable>.learn()
        println("Now into the Kotlin Course")
    }
}



fun main(){
    val course=KotlinCourse()
    course.learn()
}
