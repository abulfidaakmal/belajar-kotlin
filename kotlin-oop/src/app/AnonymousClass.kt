package app

import data.Action

fun main() {
    fireAction(SampleAction())

    fireAction(object: Action {
        override fun doSomething() {
            println("do something")
        }
    })
}

fun fireAction(action: Action) {
    action.doSomething()
}

class SampleAction : Action {
    override fun doSomething() {
        println("do something from sample action")
    }
}