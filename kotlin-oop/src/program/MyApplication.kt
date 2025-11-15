package program

import annotations.Fancy

@Fancy("Budi")
class MyApplication(val name: String, val version: Int) {
    fun info(): String = "$name ($version)"
}