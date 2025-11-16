package app

fun main() {
    val covariantString: Covariant<String> = Covariant("Joko")
    val covariantAny: Covariant<Any> = covariantString
}

class Covariant<out T>(val value: T) {
//    fun sayHi(param: T) {}

    fun data(): T = value
}