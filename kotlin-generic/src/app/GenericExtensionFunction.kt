package app

class Data<T>(val data: T) {
}

fun Data<String>.print() {
    println(this.data)
}

fun main() {
    val data1 = Data<String>("Budi")
    val data2 = Data<Int>(1)

    data1.print()
//    data2.print()
}