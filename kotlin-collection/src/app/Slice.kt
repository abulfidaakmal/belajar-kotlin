package app

fun main() {
    val numbers: List<Int> = (1..50).toList()

    println(numbers.slice(0..10))
    println(numbers.slice(0..10 step 2))
    println(numbers.slice(10 downTo 0 step 2))
}