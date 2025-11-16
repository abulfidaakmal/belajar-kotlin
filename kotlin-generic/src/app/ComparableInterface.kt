package app

import data.Fruit

fun main() {
    val apple = Fruit("Apple", 200)
    val banana = Fruit("Banana", 100)

    println(apple < banana)
    println(apple > banana)
    println(apple >= banana)
    println(apple <= banana)
}