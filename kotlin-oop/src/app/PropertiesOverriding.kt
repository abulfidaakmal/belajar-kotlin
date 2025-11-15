package app

import data.Circle
import data.Shape

fun main() {
    val shape = Shape()
    val circle = Circle()

    println(shape.corner)
    println(circle.corner)
    println(circle.parentCorner)

    shape.sayHello()
    circle.sayHello()
}