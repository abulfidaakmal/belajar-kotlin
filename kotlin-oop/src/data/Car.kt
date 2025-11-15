package data

class Car(carName: String, carBrand: String, carModel: String) {
    var name: String = carName
    var brand: String = carBrand
    var model: String = carModel

    init {
        println("call $carName")
    }

    constructor(carName: String, carBrand: String): this(carName, "", carBrand) {
        println("secondary constructor 1")
    }

    constructor(carName: String): this(carName, "") {
        println("secondary constructor 2")
    }

//    println("call $carName")
}