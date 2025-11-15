package data

sealed class Operation(val name: String)

class Plus: Operation("+")
class Minus: Operation("-")