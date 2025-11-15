package app

import data.Game
import data.Login
import data.MinMax

fun main() {
    val game = Game("Valorant", 10000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game

    println("$name, $price")

//    val result = minMax(10, 20)
//    val min = result.min
//    val max = result.max

    val (min, max) = minMax(10, 20)

    println("$min, $max")

    val login = Login("budi", "budi123")
//    login(login) {login ->
//        login.username == "budi" && login.password == "budi123"
//    }

    login(login) {(username, password) ->
        username == "budi" && password == "budi123"
    }
}

fun minMax(a: Int, b: Int): MinMax {
    return when {
        a > b -> MinMax(a, a)
        else -> MinMax(a, b)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}