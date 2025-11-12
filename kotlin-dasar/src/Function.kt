fun main() {
    hello()
    hello()

    sayHello("Budi")
    sayHello("Budi", "Joko")

    fullName(lastName = "Joko", middleName = "Budi", firstName = "Jones")
}

fun hello() {
    println("Hello")
}

fun sayHello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun fullName(firstName: String, middleName: String, lastName: String) {
    println("$firstName $middleName $lastName")
}