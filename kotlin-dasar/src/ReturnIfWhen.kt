fun main() {
    fun sayHello(name: String = ""): String {
//        return if(name == "") {
//            "Hello $name"
//        } else {
//            "Hello"
//        }

        return when(name) {
            "Budi" -> "Hello Budi"
            else -> "Hello World"
        }
    }

    println(sayHello("Budi"))
}