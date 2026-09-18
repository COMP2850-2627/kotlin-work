// Task 13.5: CurrencyConverter class

class CurrencyConverter(val service: ExchangeRateService) {
    fun convertTo(currency: String, amount: Double): Double {
        return service.rateFor(currency) * amount
    }
}
