fun main() {
    var counter = 0

    val increment: () -> Unit = {
        println("Increment")
        counter++
    }

    println(counter)

    increment()
    increment()

    println(counter)
}