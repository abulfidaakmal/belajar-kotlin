package app

import data.Employee
import data.Manager

fun main() {
    val employee = Employee("Joker")
    val manager = Manager("Budi")

    employee.sayHello()
    manager.sayHello()
}