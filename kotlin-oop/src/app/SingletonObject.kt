package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Joko"))

    Utilities.name = "Dirubah"
    println(Utilities.name)

    println(Application.toUpper("Jone"))
}