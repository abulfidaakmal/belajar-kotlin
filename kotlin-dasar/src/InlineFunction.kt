fun main() {
    println(hello({"Budi"}, {"Joko"}))
    println(hello({"Budi"}, {"Joko"}))
}

inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}