package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("John")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
    baseDelegate.sayGoodBye("John")
}