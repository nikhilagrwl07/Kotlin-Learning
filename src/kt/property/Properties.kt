package kt.property

fun main(args: Array<String>) {

    val rectangle = Rectangle(10, 15)

    println(rectangle.isSquare)
}


//In Kotlin, we work with properties. Fields does not exist in kotlin
class Rectangle(private val height: Int, private val width: Int) {

    val isSquare: Boolean   // Custom Getter
        get() {
            return height == width
        }
}


data class Employee(val SSN: Int, var phoneNumber:String)
// allowed properties --> getSSN(), getphoneNumber(), setphoneNumber()
// val refers to final keyword in java so only getter is allowed
// var refers plain variable declaration