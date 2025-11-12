fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        return "Hello ${transformer(name)}"
    }
//    val upper: (String) -> String = { value ->
//        return if(value == "") {
//            "KOSONG?"
//        } else {
//            value.uppercase()
//        }
//    }

    val upper = fun(value: String): String {
        return if(value == "") {
            "KOSONG?"
        } else {
            value.uppercase()
        }
    }

    println(hello("budi", upper))
}