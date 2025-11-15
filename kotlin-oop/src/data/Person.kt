package data

class Person {
    var firstName: String = ""
    var lastName: String = ""

    fun sayHello() {
        println("Hello $firstName")
    }

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }
}