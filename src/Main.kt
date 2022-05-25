
fun main() {
    val box1 = Box(5, 15, 6);
    println("Height: ${box1.height}");
    println("Width: ${box1.width}");
    println("Length: ${box1.length}");
    println("Volume: ${box1.volume}");
    box1.boxName = "Shoes box";
    println("Box name: ${box1.boxName}");
    box1.open();
    box1.fillContents();
    val box2 = Box();
}