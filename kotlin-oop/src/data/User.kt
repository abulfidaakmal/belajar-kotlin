package data

class User(val username: String, val age: Int) {
    override fun toString(): String {
        return "User with $username"
    }
}