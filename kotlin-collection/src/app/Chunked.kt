package app

fun main() {
    val numbers = (1..50).toList()

    val list1 = numbers.chunked(5)
    println(list1.size)
    println(list1)

    val list2 = numbers.chunked(5).map { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }

    println(list2)
}