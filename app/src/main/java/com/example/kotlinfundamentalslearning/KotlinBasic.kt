package com.example.kotlinfundamentalslearning

/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * */
fun main(arguments: Array<String>) {
    val firstName: String = "Nalou"
    val lastName = "Nguyen"
    val weight = 100.5
    var age: Int = 20
    val fullName = "$firstName $lastName"

    println("$fullName is developer")

    age += 1
    println("$fullName is $age years old")

    val ageAsString = age.toString()
    println(ageAsString)

    val ageFromString = "30".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)

    // This is a line comment
    /* This is multiline comment.
    You don't have add // before each line
     */
}