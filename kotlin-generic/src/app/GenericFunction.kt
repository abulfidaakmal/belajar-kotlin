package app

import data.Function

fun main() {
    val function = Function()
    function.sayHello<String>("Budi")
    function.sayHello<Int>(1)
}