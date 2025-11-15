package data

class Address {

    constructor(paramStreet: String) {
        street = paramStreet
    }

    constructor(paramStreet: String, paramCity: String): this(paramStreet) {
        city = paramCity
    }

    var street: String = ""
    var city: String = ""

}