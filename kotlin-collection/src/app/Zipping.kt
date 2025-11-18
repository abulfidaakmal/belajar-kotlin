package app

fun main() {
    val fruits: List<String> = listOf("apple", "orange", "banana")
    val animals: List<String> = listOf("cow", "bear", "fish")

    val list1: List<Pair<String, String>> = fruits.zip(animals)
    val list2: List<String> = fruits.zip(animals) {value1, value2 ->
        "$value1 $value2"
    }

    val list3: List<Pair<String, String>> = listOf(
        "apple" to "orange",
        "orange" to "banana",
    )

    val (first, second) = list3.unzip()

    println(list1)
    println(list2)
    println(first)
    println(second)
}