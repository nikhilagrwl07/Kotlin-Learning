package kt

fun main(args: Array<String>) {

    // lambdas can be stored in variable

    val lambdasSummation = {x:Int, y:Int -> x+y}

    val lambdasSummationWithExplicitDataType:(Int,Int) -> Int = {x, y -> x+y}

    val isEven = {i:Int-> i%2==0}

    val list = listOf<Int>(1,2,3,4,5)

    // passing lambda as an expression
    println(list.any(isEven))
    println(list.filter(isEven))

    println(isEven(42))

    run { println("hey") }

    // SAM - Single Abstract Method can be written as below in kotlin
    val runnable = Runnable { println("42") }


    val f1:(() -> Int?)? = {null}
    val f2:() -> Int? = {null}
}