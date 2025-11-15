package app

import data.Minus
import data.Operation
import data.Plus

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 10, Minus()))
}

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}