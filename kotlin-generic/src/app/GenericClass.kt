package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData("Budi", 10)
    myDataString.printData()

    val myDataInt: MyData<Int, String> = MyData(10, "Budi")
    myDataInt.printData()
}