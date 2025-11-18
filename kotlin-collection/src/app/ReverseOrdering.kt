package app

fun main() {
    val names = mutableListOf("Budi", "Joko", "Adit")

    val list1 = names.reversed()
    val list2 = names.asReversed()

    names.add("Kevin")

    println(list1)
    println(list2)
}