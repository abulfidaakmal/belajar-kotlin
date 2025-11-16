package app

fun main() {
    val invariantString: Invariant<String> = Invariant("Joko")
//    val invariantAny: Invariant<Any> = invariantString

}

class Invariant<T>(val value: T) {}