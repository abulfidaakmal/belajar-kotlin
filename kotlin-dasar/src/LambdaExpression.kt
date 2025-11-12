fun main() {
    val fullName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    println(fullName("Budi", "Joko"))

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Budi"))

    val upperName: (String) -> String = ::toUpper

    println(upperName("Joko"))
}

fun toUpper(value: String): String {
    return value.uppercase()
}