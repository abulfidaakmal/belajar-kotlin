package app

fun main() {
//    Company(Employee())
//    Company(Manager())
    Company(VicePresident())
//    Company("error")
}

interface CanSayHello {
    fun sayHello(value: String)
}

open class Employee
class Manager: Employee()
class VicePresident: Employee(), CanSayHello {
    override fun sayHello(value: String) {
        println("Hello $value")
    }
}
class Company<T >(val employee: T) where T : Employee, T : CanSayHello