package kt.function

import kt.classModifier.Colour


//Converting function to expression body useful only in case of function with simple expression
fun max(a:Int, b:Int): Int = when {
    a<b -> a
    else -> b
}

// Function returning Unit which is equivalent to void of java
fun displayMax(a:Int, b:Int){
    println(max(a, b))
}

// Function explicitly returning Unit
fun displayMaxWithUnitReturnType(a:Int, b:Int): Unit{
    println(max(a, b))
}




//Points to Note -
// 1. variable descripiton and color datatype are omitted at time of defining(allowed only in kt and not in java)
// 2. inbuilt kt function Pair<> is used
fun updateWeather(degree: Int): Pair<String, Colour> {
    val (descripiton, color) =
            if (degree < 5)
                Pair("cold", Colour.BLUE)
            else if (degree < 23)
                Pair("mild", Colour.GREEN)
            else
                Pair("hot", Colour.BLACK)

    return Pair(descripiton, color)
}

//Points to Note -
//1. replacing multiple if-else statement with when clause(only in kt)
fun updateWeatherMoreConcise(degree: Int) {
    val (descripiton, color) =
            when {
                degree < 5 -> Pair("cold", Colour.BLUE)
                degree < 23 -> Pair("mild", Colour.GREEN)
                else -> Pair("hot", Colour.BLACK)
            }
}

//Points to Note -
//1. Replaced inbuilt kt function Pair<> with to inbuilt kt function
fun updateWeatherEvenMoreConcise(degree: Int) {
    val (descripiton, color) =
            when { // when keyword with NO arguments
                degree < 5 -> "cold" to Colour.BLUE // any Boolean expression
                degree < 23 -> "mild" to Colour.GREEN
                else -> "hot" to Colour.BLACK
            }
}


// ------------------------- Types of Function -------------------------//

// Top level Function - All top level function in kt can be called as static methods in java
fun topLevel() =1

// Member Function
class A{
    fun memberFunction() = 2
}

// Local Function
fun otherFunction(){
    fun localFunction() = 3
}


// ------------------------- Function With Default Values -------------------------//

fun displayChararcterWithNumberOfTimes(character: Char = '*', size: Int = 10){

    repeat(size){
        print(character)
    }
}


fun main(args: Array<String>) {
    displayChararcterWithNumberOfTimes()
    println()
    displayChararcterWithNumberOfTimes('+')
    println()
    displayChararcterWithNumberOfTimes('&', 20)
    println()
    displayChararcterWithNumberOfTimes(size = 20)
}