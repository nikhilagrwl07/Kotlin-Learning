package kt

fun main(args: Array<String>) {

    var myEscapedString = "Hello Reader,\nWelcome to my Blog"
    println(myEscapedString)

    var myMultilineRawString = """
    The Quick Brown Fox
    Jumped Over a Lazy Dog.
    """
    println(myMultilineRawString)

    var myString = "Hey!"
    println("myString  = $myString")

    myString = "Hello!"
    println("myString  = $myString")

    //Kotlin String Template
    val myInt = 5;
    val myString2 = "myInt = $myInt"

    println(myString2)

//    String Template With Raw String
    val a = 5
    val b = 6

    val myString3 = """
    |${if (a > b) a else b}
"""
    println("Larger number is: ${myString3.trimMargin()}")

}