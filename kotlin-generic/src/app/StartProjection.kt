package app

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("James", "John", "Joko")

    displayLength(numbers)
    displayLength(names)
}

fun displayLength(values: Array<*>) {
    println(values.size)
}