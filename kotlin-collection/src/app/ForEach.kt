package app

fun main() {
    listOf("A", "B", "D", "C").forEach {
        println(it)
    }

    setOf(1, 2, 3, 4, 5).forEachIndexed { index, element ->
        println("$index: $element")
    }
}