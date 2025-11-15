package app

import data.Laptop

fun main() {
    printObject("Budi")
    printObject(1)
    printObject(true)
    printObject(Laptop("Mac"))

    printString("Budi")
    printString(true)
}

fun printObject(any: Any) {
//    if(any is Laptop) {
//        println("Laptop ${any.name}")
//    } else {
//        println(any)
//    }

    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        !is Laptop -> println("Not a Laptop")
        else -> println(any)
    }
}

fun printString(any: Any) {
//    val value = any as String
    val value = any as? String

    println(value)
}