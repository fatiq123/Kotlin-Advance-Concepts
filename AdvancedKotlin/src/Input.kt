fun main(args: Array<String>) {

    try {
        println("Write amount of money you want to enter: ")
        val amount = readlnOrNull()
        if (amount != null) {
            depositMoney(amount.toDouble())
        }
        println("Amount is: $amount")
    } catch (e: Exception) {
        println(e.toString())
    }

}


fun depositMoney(money: Double): MutableList<Double> {

    val storeMoney = mutableListOf<Double>()
    storeMoney.add(money)
    return storeMoney
}