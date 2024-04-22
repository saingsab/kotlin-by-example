package org.example.Classes

class Customer {

}

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1, "saing.sab@gmail.com")
    println(contact.id)
    contact.email = "hello.hi@hiyoo.com"
}