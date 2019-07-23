package com.example.kotlinapp1.oops

open class Animal{
    private var age:Int=0
    protected var name="Sam"
    //accessed anywhere inside the same module
    internal var isDangerous= true
//    //explicit getter and setter
//        get() = field
//        set(value){
//            if(value>=0){
//                field=value
//            }
//        }

    public fun isOld():Boolean{
        return age>25
    }
}

class Vertibrate:Animal(){
    fun introduceYourself(){
        println(name)
    }
}

fun main() {
    //for a mutable val there is only getter and no setter

    val animal=Animal()
    //it actually calls the setter
   // animal.age=8
    //not a direct field access but it internally calls the getter method
   // println(animal.age)
}