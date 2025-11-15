package app

import data.Laptop

fun main() {
    val laptop = Laptop("idk")

    println(laptop.name)
    println(laptop.toString())
    println(laptop.hashCode())
}