package app

import data.Person

fun main() {
    val person = Person()
    person.firstName = "Jack"

    person.sayHello()
    person.sayHello("Joko")
}