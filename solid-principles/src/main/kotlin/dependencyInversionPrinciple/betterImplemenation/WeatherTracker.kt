package dependencyInversionPrinciple.betterImplemenation

class WeatherTracker (private var conditions: String, private val phone: Alerter,
                      private val emailer: Alerter
) {

    fun setCurrentConditions(weatherDescription: String) {
        this.conditions = weatherDescription
        if (weatherDescription === "rainy") {
            val alert: String = phone.generateWeatherAlert(weatherDescription)
            print(alert)
        } else if (weatherDescription === "sunny") {
            val alert: String = emailer.generateWeatherAlert(weatherDescription)
            print(alert)
        } else {
            throw NotImplementedError()
        }
    }

}