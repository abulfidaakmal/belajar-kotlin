package app

fun main() {
    displayCollection(listOf("Budi", "Joko"))
    displayCollection(setOf("Budi", "Joko"))
    displayCollection(mapOf("Budi" to "Joko").entries)
//    displayCollection(mapOf("Budi" to "Joko"))

    displayMutableCollection(mutableListOf("Budi", "Joko"))
    displayMutableCollection(mutableSetOf("Budi", "Joko"))
    displayMutableCollection(mutableMapOf("Budi" to "Joko").entries)
}

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) {
        println(item)
    }
}

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) {
        println(item)
    }
}
