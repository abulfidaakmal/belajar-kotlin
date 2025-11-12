fun main() {
//    val range = 1..1000
//    val range = 1000 downTo 1
    val range = 1000 downTo 1 step 3

    println(range)
    println(range.count())
    println(range.contains(1))
    println(range.contains(10000))
    println(range.first)
    println(range.last)
    println(range.step)
}