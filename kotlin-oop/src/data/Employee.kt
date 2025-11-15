package data

open class Employee(val name: String) {
    open fun sayHello() {
        println("Hello ${this.name}")
    }
}

open class Manager(name: String): Employee(name) {
    final override fun sayHello() {
        println("Hello, my name is ${this.name}")
    }
}

class SupperManager(name: String): Manager(name) {
//    override fun sayHello() {
//        println("My name is ${this.name}")
//    }
}