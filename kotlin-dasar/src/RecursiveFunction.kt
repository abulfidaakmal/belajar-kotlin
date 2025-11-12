fun main() {
    fun factorial(num: Int): Int {
        var result = 1

        for (i in num downTo 1) {
            result *= i
        }

        return result
    }

    println(factorial(6))

    fun factorialRecursive(num: Int): Int {
        return when (num) {
            1 -> 1
            else -> num * factorialRecursive(num - 1)
        }
    }

    println(factorialRecursive(6))
}