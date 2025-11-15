package app

import data.Teacher
import data.Teacher2

fun main() {
    val teacher = Teacher("Budi")
    teacher.teach()

//    println(teacher.name)
//    println(teacher.sayHello())

    val teacher2 = Teacher2("Joko")
    teacher2.say()
}