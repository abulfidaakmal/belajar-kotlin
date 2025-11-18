package app

fun main() {
    val fruits = mapOf("a" to "apple", "b" to "banana", "o" to "orange")

    println(fruits.filter { it.value.length > 5 })
    println(fruits.filterKeys { it > "b" })
    println(fruits.filterValues { it.length > 5 })
    println(fruits.getValue("a"))
    println(fruits.getOrElse("b") { "default" })
    println(fruits.getOrElse("z") { "default" })
    println(fruits.getValue("z"))
}