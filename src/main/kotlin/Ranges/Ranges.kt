package org.example.Ranges

fun main() {
    for(i in 0..3) {
        println(i)
    }
    println(" ")

    for (i in 0 until 3) {
        println(i)
    }
    println(" ")

    for (i in 2..8 step 2) {
        println(i)
    }
    println(" ")

    for (i in 3 downTo 0) {
        println(i)
    }
    println(" ")

//    Char range
    for (c in 'a'..'d') {
        println(c)
    }
    println(" ")

    for (c in 'z' downTo 's' step 2) {
        println(c)
    }
    println(" ")

//    With a if statment
    val x = 2
    if (x in 1..5) {
        println("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        println("x is not in range from 6 to 10")
    }

}