package app

import data.Gender
import kotlin.enums.EnumEntries

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val gender: EnumEntries<Gender> = Gender.entries

    println(man)
    println(woman)
    println(gender)

    man.showDesc()
    woman.showDesc()
}