package app

fun main() {
    val fruits: List<String> = listOf("Apple", "Banana", "Pear")

    val (match, notMatch) = fruits.partition { it.length > 5 }

    println(fruits)
    println(match)
    println(notMatch)
}