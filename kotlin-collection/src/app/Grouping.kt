package app

fun main() {
    val list = listOf("a", "b", "c", "b", "a", "c", "bb", "cc", "aa")

    val map: Map<String, List<String>> = list.groupBy { it }
    val map2: Map<Int, List<String>> = list.groupBy { it.length }
    println(map)
    println(map2)

    val group: Grouping<String, String> = list.groupingBy { it }
    println(group)
}