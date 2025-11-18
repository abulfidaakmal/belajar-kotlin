package app

fun main() {
    val fruits = listOf("Apple", "Banana", "Pear")

    println(fruits.any {it.length > 4})
    println(fruits.none {it.length > 4})
    println(fruits.all {it.length > 4})
    println(fruits.any())
    println(fruits.none())
}