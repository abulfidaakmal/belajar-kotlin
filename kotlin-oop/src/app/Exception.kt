package app

import exception.ValidationException

fun main() {
//    validationSayHello("Budi")
//    validationSayHello("")

    try {
        validationSayHello("Budi")
        validationSayHello("")
    } catch (e: ValidationException) {
        println("Validation Error: ${e.message}")
    }
}

fun validationSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name cannot be empty")
    } else {
        println("Hello $name")
    }
}