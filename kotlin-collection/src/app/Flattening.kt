package app

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Budi", "Joko"),
        listOf("Banana", "Apple"),
        listOf("Bear", "Cow")
    )

    println(list.flatten())

    val members: List<Member> = listOf(
        Member("Budi", listOf("Coding", "Gaming")),
        Member("Joko", listOf("Badminton", "Footbal")),
    )

//    println(members.map { it.hobbies }.flatten())
    println(members.flatMap { it.hobbies })
}

class Member(val name: String, val hobbies: List<String>)