package kt.collection

import kt.collection.Gender.FEMALE
import kt.collection.Gender.MALE

fun main(args: Array<String>) {

    val heroes = listOf(
            Hero("Nikhil", 46, null),
            Hero("Nikhil2", 26, MALE),
            Hero("Ritu", 29, FEMALE)
    )

    println(heroes.last().name)
    println(heroes.first().name)
    println(heroes.firstOrNull())

    val namewithSafeCheck = heroes.firstOrNull { it.age == 30 }?.name // safe access
    println(namewithSafeCheck)

//    val namewithCheckWithExcpetion = heroes.first{ it.age == 30 }.name // Throws java.util.NoSuchElementException
//    println(namewithCheckWithExcpetion)

    val sizeOfDistinctAgesOfHeros = heroes.map { it.age }.distinct().size
    println(sizeOfDistinctAgesOfHeros)


    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println(youngest)
    println(oldest)


    val nameWithMaximumAge = heroes.maxBy { it.age }?.name
    println(nameWithMaximumAge)
}


data class Hero(val name: String,
                val age: Int,
                val gender: Gender?)

enum class Gender {
    MALE, FEMALE
}


