package org.example.Variables

fun someCondition() = true

fun main() {
    var a: String = "initial"
    println(a)

    val b: Int = 1
    val c = 3

    var e: Int = 10
    println(e)

    val d: Int
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)

}