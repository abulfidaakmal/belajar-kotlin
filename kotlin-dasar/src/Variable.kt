//const var APP = "Belajar Kotlin"
const val APP = "Belajar Kotlin"

fun main() {
//    const val APP = "Belajar Kotlin"

    println(APP)

    var name: String = "Budi"
    name = "Joko"

    println(name)

    val street: String = "Jl.Merdeka"
//    street = "Jl.Merpati"

    var languange: String? = null

//    println(languange.length)
    println(languange?.length)

    languange = "Kotlin"

    println(languange)

}