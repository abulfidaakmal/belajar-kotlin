package app

fun main() {
    val list: List<String> = listOf("Budi", "Joko", "James")

    println(list.joinToString(" ", "#", "#"))
    println(list.joinToString(" ", "#", "#") {it.uppercase()})

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", "#", "#")
    list.joinTo(builder, " ", "$", "$")

    println(builder.toString())
}