package app

import data.Employee
import data.Manager

fun main() {
    var employee = Employee("Joko")
    employee.sayHello()

    employee = Manager("Budi")
    employee.sayHello()
}