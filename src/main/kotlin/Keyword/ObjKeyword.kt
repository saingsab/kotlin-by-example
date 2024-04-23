package org.example.Keyword
import java.util.Random

class LuckDispatcher { //1
    fun getNumber() {  //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

//object Expression
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price: $$total")
}

//object Declaration
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

//Companion Objects
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher() //3
    val d2 = LuckDispatcher()

    d1.getNumber() //4
    d2.getNumber()

    rentPrice(10, 2, 1)

    DoAuth.takeParams("foo", "qwerty")
    BigBen.getBongs(12)
}

/*
*   1. Defines a blueprint.
    2. Defines a method.
    3. Creates instances.
    4. Calls the method on instances.
* */
