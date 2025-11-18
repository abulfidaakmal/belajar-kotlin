package app

fun main() {
    val names: List<String> = listOf("Budi", "Joko", "Budi")

    println(names.isEmpty())
    println(names.isNotEmpty())
    println(names.get(0))
    println(names.indexOf("Budi"))
    println(names.lastIndexOf("Budi"))
    println(names.contains("Joko"))
    println(names.contains("James"))
    println(names.containsAll(listOf("Budi", "Joko")))
}