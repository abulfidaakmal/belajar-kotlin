fun main() {
    val nilai: Char = 'A'
    val nilaiLulus: Array<Char> = arrayOf('A', 'B', 'C')

    when (nilai) {
        'A', 'B' -> println("Keren bet lu")
        'C' -> println("Biasa aja lu")
        'D' -> println("Ga keren lu")
        else -> println("Bukan temen gua lu")
    }

    when (nilai) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Ga lulus")
    }
}