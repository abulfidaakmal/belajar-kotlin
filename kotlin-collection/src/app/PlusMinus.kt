package app

fun main() {
    val fruits = listOf("Apple", "Banana")
    println(fruits + "Pear")
    println(fruits + listOf("Watermelon", "Wine"))
    println(fruits - "Wine")
    println(fruits - listOf("Apple", "Banana"))

    val animals = mapOf("s" to "Snake", "c" to "Cow")
    println(animals + Pair("b", "Bear"))
    println(animals- "a")
}