data class Person(
    val id: String,
    val fistName: String,
    val lastName: String,
    val country: String
) {
    fun getName() = "$fistName $lastName"
}

fun main() {
    val person = Person("1", "Daniel", "Soto","Perú")
    val person1 = Person("1", "Daniel", "Soto",  "Perú")
    println(person == person1)
    println(person.getName())

//    //componentN
//    println(person.component1())
//    println(person.component2())
//    println(person.component3())
//    println(person.component4())

    val (id, fistName, lastName, country) = person // destructuring declaration
    println("$id $fistName $lastName $country")
}
