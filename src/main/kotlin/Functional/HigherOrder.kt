package org.example.Functional

/*
* A higher-order function is a function that takes another function as parameter and/or returns a function.*/

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

//Returning Functions
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) {a, b -> a * b}
    println("sumResult $sumResult, mulResult $sumResult")

    val func = operation()
    println(func(2))
}