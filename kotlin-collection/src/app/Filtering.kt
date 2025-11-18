package app

fun main() {
    val animals = listOf<String>("Bear", "Snake", "Cow", "Monkey")

    println(animals.filter { it.length > 4 })
    println(animals.filterNot { it.length > 4 })
    println(animals.filterIndexed { index, value -> index % 2 == 0 })

    val fruits = listOf<Any?>("Apple", "Banana", "Pear", null, 1, 2)
    println(fruits.filterNotNull())
    println(fruits.filterIsInstance<String>())
}