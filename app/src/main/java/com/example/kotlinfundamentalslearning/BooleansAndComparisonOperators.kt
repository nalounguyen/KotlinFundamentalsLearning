package com.example.kotlinfundamentalslearning

fun main() {
    val passingScore = 100
    val studentScore = 50

    val studentPassed = studentScore >= passingScore
    println("student passed: $studentPassed")

    val studenFailed = studentScore < passingScore
    println("student failed: $studenFailed")

    /**
     * Challenge 1: Check password is secured ? If it has at least 10 characters
     * */
    val password = "hello"
    val isPasswordSecured = password.length >= 10
    println("Password is secured: $isPasswordSecured")


    /**
     * Challeng 2: Check two people has the same name length
     * */
    val nameOne = "Nguyen Van Teo"
    val nameTwo = "Ly Minh Anh"
    val isTheSameLength = nameOne.length == nameTwo.length
    println("Is the same name length: $isTheSameLength")


}