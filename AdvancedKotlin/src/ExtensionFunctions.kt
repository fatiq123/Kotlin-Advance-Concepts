fun main() {
    val list = mutableListOf("First", "seConD", "ThIRd")
    list.concatenateLowercase()
}

fun MutableList<String>.concatenateLowercase(): String {
    return this.map { it -> it.lowercase() }.joinToString("")
}

