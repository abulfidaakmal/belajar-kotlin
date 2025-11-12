fun main() {
    val names: Array<String> = arrayOf("Budi", "Joko")

    println(names.size)
    println(names[0])
    println(names.get(0))

    names.set(0, "James")
    names.set(1, "Jone")

    println(names[0])
    println(names[1])
}