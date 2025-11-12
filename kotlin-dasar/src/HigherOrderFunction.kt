fun main() {
    val upperTransformer = {value: String -> value.uppercase()}
    val lowerTransformer = {value: String -> value.lowercase()}

    println(hello("Budi", upperTransformer))
    println(hello("Budi", lowerTransformer))

    val result = hello("Jones") { value: String ->
        value.uppercase()
    }

    println(result)
}

fun hello(name: String, transformer: (String) -> String): String {
    return "Hello ${transformer(name)}"
}