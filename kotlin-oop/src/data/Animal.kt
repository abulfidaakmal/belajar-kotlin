package data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Dog(dogName: String) : Animal() {
    override val name: String = dogName
    override fun run() {
        println("$name is running")
    }
}