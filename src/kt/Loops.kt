package kt

fun main(args: Array<String>) {

    val alphabets = listOf("a", "b", "c")

    // simple for loop
    for(a in alphabets)
        println(a)

    for (i in 1..9) // includes upper bound
        println("$i")

    for(i in 1 until 10) // excludes upper bound
        println("$i")

    for(i in 9 downTo 1 step 2)
        println("$i")

    for(ch in "abc")
        println(ch+1)


    // Looping using for loop with Index
    for((index, value) in alphabets.withIndex())
        println("$index : $value")


    val map = mapOf(1 to "One",
                                   2 to "two",
                                   3 to "three")

    // iterating over map using for loop
    for((key,value) in map){
        println("$key = $value")
    }
}

