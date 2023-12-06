import dependencyInversionPrinciple.betterImplemenation.Emailer
import dependencyInversionPrinciple.betterImplemenation.Phone
import dependencyInversionPrinciple.betterImplemenation.WeatherTracker
import interfaceSegregationPrinciple.betterImplementation.Eagle
import interfaceSegregationPrinciple.betterImplementation.Penguin
import openClosedPrinciple.betterImplementation.EmailGreeting
import openClosedPrinciple.betterImplementation.FormalGreeting

fun main(args: Array<String>) {
    // ЗАДАНИЕ 1: Приветствие
    val greeting: EmailGreeting = FormalGreeting()
    require(greeting.greeting == "Good evening, sir.") {
        "Wrong message intro"
    }

    // ЗАДАНИЕ 2: Уведомления о погоде
    val tracker = WeatherTracker(phone = Phone(), emailer = Emailer(), conditions = "sunny")

    // let's get a phone notification
    tracker.setCurrentConditions("rainy")

    // ЗАДАНИЕ 3: Птицы бывают разные (но не все всё умеют)
    val eagle = Eagle(150)
    eagle.fly()

    val penguin = Penguin(0)

    // Пингвин не хочет чувствовать себя ущербным:(
    // А мы не хотим видеть исключения в коде...
    penguin.swim()



}