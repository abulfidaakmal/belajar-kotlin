package app

fun main() {
    val list: List<String> = listOf("Budi", "Joko", "John", "James")

    val map: Map<String, Int> = list.associate { Pair(it, it.length) }
    val map2: Map<String, Int> = list.associateWith { it.length }
    val map3: Map<Int, String> = list.associateBy { it.length }

    println(map)
    println(map2)
    println(map3)
}