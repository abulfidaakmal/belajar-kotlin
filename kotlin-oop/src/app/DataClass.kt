package app

import data.Product

fun main() {
    val product = Product("Noodle", 1000, "Food")
    val product2 = product.copy(name = "Snack")

    println(product)
    println(product2)
}