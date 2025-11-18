package app

fun main() {
    val pair1: Pair<String, String> = Pair("Budi", "Joko")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Budi" to "Joko"
    println(pair2.first)
    println(pair2.second)
}