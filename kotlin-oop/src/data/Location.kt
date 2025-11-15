package data

abstract class Location(val name: String) {
}

class City(name: String) : Location(name) {}