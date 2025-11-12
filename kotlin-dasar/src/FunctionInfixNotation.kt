fun main() {
    println("Budi" to "UP")
    println("Budi" to "LO")
}

infix fun String.to(type: String): String {
    if(type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}