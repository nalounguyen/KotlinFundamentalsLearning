package com.example.kotlinfundamentalslearning

fun main() {
    val hondaScore = 40
    val meritAwardScore = 90
    var message: String
    val hondaIsPerfectAttendance = true

    val hondaIsMeritStudent = hondaIsPerfectAttendance && hondaScore >= meritAwardScore
    println(hondaIsMeritStudent)

    if (hondaIsMeritStudent) {
        message = "Congratulation"
    }else {
        message = "Keep studying"
    }
    println(message)
}