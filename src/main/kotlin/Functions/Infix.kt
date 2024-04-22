package org.example.Functions

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "BYE \n")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}

class Person(val name: String) {
    val likePeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likePeople.add(other)}
}