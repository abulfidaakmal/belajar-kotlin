package app

import data.Note

fun main() {
    val note = Note("Kotlin")

    println(note.title)

    note.title = "Java"

    println(note.title)
}