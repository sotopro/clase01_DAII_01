class PremiumCoffeeMachine (
    private val price: Double,
    private val color: String
        ) : BaseCoffeeMachine(price, color) {
            fun makeCapuccino() {
                println("here is your capuccino")
            }
}