package app

fun main() {
    displayListIterator(listOf("Budi", "Joko").listIterator())
}

fun <T> displayListIterator(list: ListIterator<T>) {
    println("display next")
    while (list.hasNext()) {
        println(list.next())
    }

    println("display previous")
    while (list.hasPrevious()) {
        println(list.previous())
    }
}