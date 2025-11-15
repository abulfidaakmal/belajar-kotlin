package data

open class Customer(val name: String, val age: Int) {
    constructor(name: String): this(name, 0)
}

class PremiumCustomer: Customer {
    constructor(name: String, age: Int): super(name, age)
    constructor(name: String): super(name)
}