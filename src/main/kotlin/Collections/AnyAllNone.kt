package org.example.Collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any { it < 0}
    val anyGT6 = numbers.any { it > 6 }

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

//    All
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }

    println(allEven)
    println(allLess6)

//    None
    val allEven1 = numbers.none { it % 2 == 1 }           // 2
    val allLess61 = numbers.none { it > 6 }
}