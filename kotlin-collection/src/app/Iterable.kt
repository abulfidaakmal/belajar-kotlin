package app

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

fun main() {
    displayIterable(listOf(1, 2, 3))
    displayIterable(setOf("Budi", "Joko"))
}