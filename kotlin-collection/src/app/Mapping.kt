package app

fun main() {
    val names: List<String> = listOf("Budi", "Joko", "James")

    val list1 = names.map { value -> value.uppercase() }
    val list2 = names.mapIndexed { index, value ->
        if(index % 2 == 1) value.uppercase() else value
    }

    println(list1)
    println(list2)

}