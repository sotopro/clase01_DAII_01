class Box (
    var length: Int = 0,
    var width: Int = 0,
    var height: Int = 0,
) {

    init {
        println("Box is created")
    }

    constructor() : this(0, 0, 0) {
        println("Secondary constructor called")
    }

    val volume get() = length * width * height
    var boxName: String = "Box Name"
    set(value) {
        if(value.length < 3) {
            println("Box name must be at least 3 characters long")
        } else {
            field = value
        }
    }

    fun fillContents() {
        println("Filling the box...")
    }

    fun open() {
        println("Opening the box...")
    }
}