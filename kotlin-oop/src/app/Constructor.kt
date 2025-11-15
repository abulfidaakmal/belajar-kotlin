package app

import data.Address
import data.Car

fun main() {
    val car1 = Car("nama", "merek", "model")
    val car2 = Car("nama", "merek")
    val car3 = Car("nama",)

    println(car1.name)

    val address1 = Address("London", "New York")
    val address2 = Address("London")

    println(address1.street)
}