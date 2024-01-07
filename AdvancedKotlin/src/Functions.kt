fun main(args: Array<String>) {
    intFunction()
    doubleFunction()
    returnListFunction()
}

fun intFunction() : Int {
    return 1+1
}

fun doubleFunction(): Double {
    return 1+1.0
}

fun returnListFunction(): MutableList<Int> {
    return mutableListOf<Int>(1,1)
}