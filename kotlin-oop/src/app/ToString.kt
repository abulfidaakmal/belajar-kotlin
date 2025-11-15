package app

import data.Address
import data.User

fun main() {
    val user = User("Budi", 10)
    val address = Address("London", "New York")

    println(user.toString())
    println(address.toString())
}