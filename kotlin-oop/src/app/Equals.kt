package app

import data.Company

fun main() {
    val company1 = Company("JetBrains")
    val company2 = Company("JetBrains")

    println(company1 == company2)
    println(company1 == company1)
}