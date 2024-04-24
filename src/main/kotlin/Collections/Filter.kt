package org.example.Collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val possitives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println("Numbers: $numbers")
    println("Positive Number: $possitives")
    println("Negative Number: $negatives")
}