package kt

import kt.Colour.*

object MainDriver {

    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person("Nikhil", 26)
        println(person.name)
    }
}


//Points to Note -
// 1. variable descripiton and color datatype are omitted at time of defining(allowed only in kt and not in java)
// 2. inbuilt kt function Pair<> is used
fun updateWeather(degree : Int){
    val (descripiton , color) =
            if(degree<5)
                Pair("cold", BLUE)
            else if(degree<23)
                Pair("mild", GREEN)
            else
                Pair("hot", BLACK)
}

//Points to Note -
//1. replacing multiple if-else statement with when clause(only in kt)
fun updateWeatherMoreConcise(degree : Int){
    val (descripiton , color) =
            when {
                degree<5 -> Pair("cold", BLUE)
                degree<23 -> Pair("mild", GREEN)
                else -> Pair("hot", BLACK)
            }
}

//Points to Note -
//1. Replaced inbuilt kt function Pair<> with to inbuilt kt function
fun updateWeatherEvenMoreConcise(degree : Int){
    val (descripiton , color) =
            when {
                degree<5 -> "cold" to BLUE
                degree<23 -> "mild" to GREEN
                else -> "hot" to BLACK
            }
}

