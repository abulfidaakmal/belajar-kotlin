fun main() {
    val name: String = "Budi"

    name.hello()
}

fun String.hello() = println("Hello $this")