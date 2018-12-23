package kt

import kt.Colour.*

fun main(args: Array<String>) {
    val person = Person("Nikhil", 26)
    println(person.name)

    val name = if (args.size>0)  args[0] else "Kotlin"

    println("Hello $name!!") //Using $name as String template for showing value of name which is string datatype

    println("Hello ${updateWeather(50)}!!") // another way to call function as String template

    // MutableList
    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")

    // Read-Only List
    val readOnlyList = listOf<String>("Java")
//    readOnlyList.add("Kotlin") --> Not allowed to add/remove element from list
}

