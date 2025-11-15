package app

import data.Student

typealias Pelajar = Student

typealias Supplier = () -> String

fun sayHello(name: Supplier) {
    println("Hello, ${name()}")
}

fun main() {
    val pelajar = Pelajar("idk")

    println(pelajar.name)

    sayHello { "Budi" }
}