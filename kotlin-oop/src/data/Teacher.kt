package data

open class Teacher(private val name: String) {
    fun teach() {
        println("Teaching")
    }

    protected fun sayHello() {
        println("Hello")
    }
}

class Teacher2(name: String): Teacher(name) {
    fun say() {
        super.sayHello()
    }
}