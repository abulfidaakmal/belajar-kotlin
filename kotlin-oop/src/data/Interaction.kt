package data

interface Interaction {
    val name: String
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go: Interaction {
    fun go() {
        println("Go!")
    }
}

interface MoveA {
    fun move() = println("MoveA")
}

interface MoveB {
    fun move() = println("MoveB")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        super<MoveB>.move()
        println("MoveHuman")
    }
}

//class Human(override val name: String) : Interaction, Go {
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name}")
//    }
//}
