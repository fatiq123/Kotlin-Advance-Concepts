fun main(args: Array<String>) {

    val double = { a: Int -> a * 2 }
    val triple = { b: Int -> b * 3 }
    print(apply(f = double, 1, 2))
    print(apply(f = triple, 1, 2))


}

fun apply(f: (Int) -> Int, a: Int, b: Int): Int {
    return f(a) + f(b)
}