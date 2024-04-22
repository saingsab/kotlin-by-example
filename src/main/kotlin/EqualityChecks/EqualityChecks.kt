package org.example.EqualityChecks

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writer = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writer)
    println(authors === writer)
}