fun main() {
    finalValue(10, 10, 10, 10)
}

fun finalValue(vararg values: Int) {
    var total = 0

    for(value in values) {
        total += value
    }

    println(total)
}