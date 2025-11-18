package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Banana", 100),
        Fruit("Pineapple", 150),
        Fruit("Apple", 50)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println(fruits.sortedByDescending { it.name })
}