// Task 13.5: currency converter demo program

fun main() {
    val service = ExchangeRateService()
    val converter = CurrencyConverter(service)

    val yen = converter.convertTo("JPY", 1.5)
    val dollars = converter.convertTo("USD", 1.5)

    println("GBP 1.50 = JPY %.02f".format(yen))
    println("GBP 1.50 = USD %.02f".format(dollars))
}
