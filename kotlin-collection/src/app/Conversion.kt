package app

fun main() {
    val array = arrayOf("A", "E", "B", "D", "C")
    val range = 1..10

    val set = array.toSet()
    val list = array.toList()

    range.toMutableSet()
    range.toMutableList()

    list.toMutableList()
    set.toMutableList()

    println(array.toSortedSet())
}