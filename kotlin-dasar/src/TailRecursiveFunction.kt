fun main() {
    tailrec fun display(num: Int) {
        println("Recursive $num")

        if(num > 0) {
            display(num - 1)
        }
    }

    display(10000)

//    tailrec fun factorialRecursive(num: Int): Int {
//        return when (num) {
//            1 -> 1
//            else -> num * factorialRecursive(num - 1)
//        }
//    }

//    println(factorialRecursive(10))

    tailrec fun factorialTail(num: Int, total: Int = 1): Int {
        return when(num) {
            1 -> total
            else -> factorialTail(num - 1, num * total)
        }
    }

    println(factorialTail(10))
}