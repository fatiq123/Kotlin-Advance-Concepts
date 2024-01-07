fun main() {
    val list = mutableListOf("First", "seConD", "ThIRd")
    list.concatenateLowercase()

    println("hello World")

    val number = 12
    if (number.isEven()) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}

fun MutableList<String>.concatenateLowercase(): String {
    return this.map { it -> it.lowercase() }.joinToString("")
}
fun Int.isEven(): Boolean {
    return this % 2 == 0
}
