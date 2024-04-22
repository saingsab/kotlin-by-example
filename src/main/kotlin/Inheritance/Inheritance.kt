package org.example.Inheritance

open class Dog {
    open fun sayHello() {
        println("Wow Wow!")
    }
}

class Youkshire: Dog() {
    override fun sayHello() {
        println("wif Wif!")
    }
}
//Inheritance with Parameterized Constructor
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhh!")
    }
}

class SiberianTiger: Tiger("Siberia")

//Passing Constructor Arguments to Superclass
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin say: grao!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val dog: Dog = Youkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion : Lion = Asiatic("Rufo")
    lion.sayHello()
}