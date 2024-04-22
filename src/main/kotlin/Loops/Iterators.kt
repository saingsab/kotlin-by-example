package org.example.Loops

class Animal(val name: String)

class Zoo(val animal: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animal.iterator()
    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}