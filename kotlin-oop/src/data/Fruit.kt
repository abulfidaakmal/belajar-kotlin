package data

data class Fruit(val quantity: Int) {
    operator fun plus(other: Fruit): Fruit {
        return Fruit(this.quantity + other.quantity)
    }
}
