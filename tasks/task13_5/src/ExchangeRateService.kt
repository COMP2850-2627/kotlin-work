// Task 13.5: service to retrieve currency exchange rates

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.net.URI

const val SERVICE_URL = "https://open.er-api.com/v6/latest/GBP"

class ExchangeRateService {
    private val url = URI.create(SERVICE_URL).toURL()
    private val mapper = jacksonObjectMapper()
    private val rates = mutableMapOf<String, Double>()

    init { updateRates() }

    fun updateRates() {
        val json = mapper.readTree(url.openStream())
        for (rate in json.path("rates").properties()) {
            rates[rate.key] = rate.value.asDouble()
        }
    }

    fun rateFor(currency: String): Double = rates.getOrElse(currency) {
        throw IllegalArgumentException("Unsupported currency: $currency")
    }
}
