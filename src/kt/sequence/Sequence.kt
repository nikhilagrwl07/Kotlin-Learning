package kt.sequence

import kotlin.random.Random


fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)

    // Using Collection will create below 2 new list namely , one for map and another new list for filter
    val maxOfSquaredOddNumber = list
            .map { it * it }
            .filter { it % 2 == 1 }
            .max()

    println(maxOfSquaredOddNumber)



    // Sequence in kotlin is same as streams in java 8. Lazy Evaluation is done only when result is asked for
    val maxOfSquaredOddNumberSequence = list
            .asSequence()
            .map { it * it }
            .filter { it % 2 == 1 }
            .max()

    println(maxOfSquaredOddNumberSequence)


    // Generating sequences

    val sequence = generateSequence {
            Random.nextInt(5).takeIf { it >0 }
    }
    println(sequence.toList())


    val numbers = generateSequence(3) { n ->
        println("Generating element...")
        (n + 1).takeIf { it < 7 }
    }
    println(numbers.first())
}