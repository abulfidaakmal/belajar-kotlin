package app

fun main() {
    val map: Map<String, String> = mapOf(
        "a" to "Budi",
        "b" to "Joko"
    )

    println(map.entries)
    println(map.keys)

    for ((key, value) in map) {
        println("$key: $value")
    }
}