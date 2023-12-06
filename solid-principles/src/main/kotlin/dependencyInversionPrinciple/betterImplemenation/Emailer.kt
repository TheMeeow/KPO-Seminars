package dependencyInversionPrinciple.betterImplemenation

class Emailer : Alerter {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}