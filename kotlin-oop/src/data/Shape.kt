package data

open class Shape {
    open val corner: Int = 1

    open fun sayHello() {
        println("Hello")
    }
}

class Circle() : Shape() {
    override val corner: Int = 2
    val parentCorner: Int = super.corner

    override fun sayHello() {
        println("Hello there")
        super.sayHello()
    }
}