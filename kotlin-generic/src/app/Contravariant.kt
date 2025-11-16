package app

fun main() {
    val contravariantAny: Contravariant<Any> = Contravariant()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Budi")
}

class Contravariant<in T> {
    fun sayHello(value: T) {
        println("Hello $value")
    }
}