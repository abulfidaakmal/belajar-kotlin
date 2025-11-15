package app

data class Fruit(val name:String)

fun sayHello(fruit: Fruit?) {
//    if(fruit != null) {
//        println("Hello ${fruit.name}")
//    }

//    println("Hello ${fruit?.name}")

//    val name = fruit?.name ?: "empty"
    val name = fruit!!.name

    println("Hello $name!")
}

fun main() {
    sayHello(Fruit("Apple"))
    sayHello(null)
}