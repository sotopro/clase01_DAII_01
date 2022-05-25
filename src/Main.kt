
fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo();
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)

}