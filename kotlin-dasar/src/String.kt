fun main() {
    var name: String = "Budi"
//    var street: String = """
//        Jl.Merdeka,
//        No.9
//    """

//    var street: String = """
//        |Jl.Merdeka,
//        |No.9
//    """.trimMargin()

    var street: String = """
        ?Jl.Merdeka,
        ?No.9
    """.trimMargin("?")

    println(name)
    println(street)

    var firstName: String = "James"
    var lastName: String = "Nih"
//    var fullName: String = firstName + " " + lastName
    var fullName: String = "$firstName $lastName"

    println(fullName)
    println(fullName.length)
}