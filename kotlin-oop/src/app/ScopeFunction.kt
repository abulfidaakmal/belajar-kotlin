package app

import data.Student

fun main() {
    val student = Student("John")

    val result1: String = student.let {
        "My name is ${it.name}"
    }
    println(result1)

    val result2: String = student.run {
        println(this.name)
        "My name is $name"
    }
    println(result2)

    val result3: Student = student.apply {
        "My name is $name"
    }
    println(result3)

    val result4: Student = student.also {
        "My name is ${it.name}"
    }
    println(result4)

    val result5: String = with(student) {
        println(this.name)
        "My name is $name"
    }
    println(result5)
}