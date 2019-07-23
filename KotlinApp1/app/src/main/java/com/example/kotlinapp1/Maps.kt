package com.example.kotlinapp1

fun main() {
    val namesToAges= mapOf(Pair("Peter",24),Pair("Roger",33)) //not mutable
    val namesToAges2= mapOf(
        "Akshara" to 22,
        "Naina" to 20
    )
    println(namesToAges.keys)
    println(namesToAges2.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf( //mutable
        "USA" to 300_000_000,
        "India" to 1_000_000_000
    )
    countryToInhabitants.put("Austria", 40_000_000)
    countryToInhabitants.putIfAbsent("USA", 32_000_000)
    //this will add into country if
    // there is no value with key name 'USA' otherwise leave as it is
    println(countryToInhabitants)

    println(countryToInhabitants.contains("India"))
    println(countryToInhabitants.containsKey("France"))

    println(countryToInhabitants.get("USA"))
    println(countryToInhabitants.getOrDefault("France", 0))

    namesToAges2.entries.forEach{
        println("${it.key} is ${it.value} years old")
    }

}