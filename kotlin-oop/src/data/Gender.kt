package data

enum class Gender(val desc: String) {
//    MALE, FEMALE
    MALE("Male"),
    FEMALE("Female");

    fun showDesc() {
        println(desc)
    }
}