package data

class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getFirst(): T = firstData

    fun getSecond(): U = secondData

    fun printData() {
        println("The data is $firstData and $secondData")
    }

}