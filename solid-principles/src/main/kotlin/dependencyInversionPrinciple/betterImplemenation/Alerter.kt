package dependencyInversionPrinciple.betterImplemenation

interface Alerter {
    fun generateWeatherAlert(weatherConditions: String): String
}