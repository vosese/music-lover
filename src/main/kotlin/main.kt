fun main() {
    val sum: Int = 12500
    var discount: Float = 0F
    if (sum >= 1001 && sum < 10000) {
        discount = 100F
    }
    if (sum >= 10001) {
        discount = (sum * 0.05).toFloat()
    }
    var endSum: Float = sum - discount

    val musicLover = true
    println("Итоговая сумма: " + endSum + " рублей")
    if (musicLover) {
        println("Итоговая сумма: " + endSum * 0.99F + " рублей")
    }
}