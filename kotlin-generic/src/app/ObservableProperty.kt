package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(value: T): ObservableProperty<T>(value) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before changed $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After changed $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull()
}

fun main() {
    val car = Car("Honda", 2000)

    println(car.brand)
    println(car.year)

    car.brand = "Toyota"
    car.year = 2002

    println(car.brand)
    println(car.year)

    car.owner = "Budi"
    println(car.owner)
}