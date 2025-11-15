package app

import data.Boss

fun main() {
    val boss = Boss("Joko")
    val employee = boss.Employee("John")

    employee.sayHi()
}