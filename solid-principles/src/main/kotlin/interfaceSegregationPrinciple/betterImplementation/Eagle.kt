package interfaceSegregationPrinciple.betterImplementation


class Eagle(var numberOfFeathers: Int): Flyable, HasFeathers {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}