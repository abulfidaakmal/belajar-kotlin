package app

fun main() {
    val chars: List<Char> = ('a'..'z').toList()

    println(chars.take(5))
    println(chars.takeLast(5))
    println(chars.takeWhile{ it < 'w'})
    println(chars.takeLastWhile{ it > 'w'})

    println(chars.drop(5))
    println(chars.dropLast(5))
    println(chars.dropWhile{ it > 'w'})
    println(chars.dropLastWhile{ it > 'w'})
}