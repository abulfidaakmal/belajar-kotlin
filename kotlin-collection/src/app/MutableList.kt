package app

fun main() {
    val names: MutableList<String> = mutableListOf()

    names.add("Budi")
    names.add("Joko")
    names.add("Budi")

    println(names[0])
    println(names[1])
    println(names[2])

    names.set(2, "James")
    println(names[2])
}