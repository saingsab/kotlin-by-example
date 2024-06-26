package org.example.Collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first{ it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 !=0 }

    println("Number: $numbers")
    println("First: $first, Last: $last, First even : $firstEven, last odd $lastOdd")
}