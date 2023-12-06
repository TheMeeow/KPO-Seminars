package dependencyInversionPrinciple.betterImplemenation

class Phone : Alerter {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}