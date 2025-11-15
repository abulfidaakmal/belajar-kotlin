package app

import data.Person

fun main() {
    val budi = Person()
    budi.firstName = "Budi"

    val joko = Person()
    joko.firstName = "Joko"

    println(budi)
    println(joko)

    println(budi.firstName)
    println(joko.firstName)
}