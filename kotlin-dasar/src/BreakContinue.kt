fun main() {
    var i = 0

    while (true) {
        println("Hello World")
        i++

        if(i == 10) {
            break
        }
    }

    for (i in 1..10) {
        if (i % 2 == 1) {
            continue
        }

        println(i)
    }
}