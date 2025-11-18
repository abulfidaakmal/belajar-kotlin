package app

fun main() {
    val names = setOf("Budi", "Joko", "Adit")

    println(names.elementAt(2))
    println(names.first())
    println(names.last())
    println(names.elementAtOrNull(2))
    println(names.elementAtOrElse(2, {"default"}))
    println(names.elementAtOrNull(4))
    println(names.elementAtOrElse(4, {"default"}))
}