fun main() {
    var age: Byte = 20
    var height: Int = 100
    var distance: Short = 2000
    var balance: Long = 10_000_000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    var value: Float = 20f
    var radius = 1000.100

    println(value)
    println(radius)

    var decimal: Int = 100
    var hex: Int = 0xff
    var binary: Int = 0b0001

    println(decimal)
    println(hex)
    println(binary)

    var price: Long = 10_000_000_000L

    println(price.toInt())
    println(decimal.toDouble())
}