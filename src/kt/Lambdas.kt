package kt

fun main(args: Array<String>) {

    val lambdaAdditionExample1 = { x: Int, y: Int -> x + y }

    println(lambdaAdditionExample1(10, 20))


    // Lambdas used for filtering
    listOf(1, 2, 3, 4, 5).any({ i: Int -> i > 2 })
    listOf(1, 2, 3, 4, 5).any() { i: Int -> i > 2 }
    listOf(1, 2, 3, 4, 5).any { i -> i > 2 }  // omitting data type of i and removing () from any
    listOf(1, 2, 3, 4, 5).any { it > 2 } // it denotes the argument if it's only one


    // Multiline Lambda
    listOf(1, 2, 3, 4, 5).any {
        println("processing $it")
        it > 2 // this should be last line
    }

    // Lambdas on Hashmap
    val hashMap = mapOf(1 to "One",
            2 to "Two",
            3 to "Three")

    hashMap.mapValues { entry -> println("${entry.key}  -> ${entry.value}") }

    // destructing declarations syntax means Kotlin compiler will by itself deduce or breakdown of Map.entry to (key, value)
    hashMap.mapValues { (key, value) -> println("$key  -> $value") }

    hashMap.mapValues { (_, value) -> println("$value") }



    println(duplicateNonZeroNumber(listOf(1, 2, 3, 4, 5)))
    println(duplicateNonZeroNumber(listOf(1, 2, 0, 4, 5)))


    println(duplicateNonZeroNumberWithReturnAtFlatMapLevel(listOf(1, 2, 3, 4, 5)))
    println(duplicateNonZeroNumberWithReturnAtFlatMapLevel(listOf(1, 2, 0, 4, 5)))
}

// return returning to top level where  fun is defined
fun duplicateNonZeroNumber(list:List<Int>):List<Int> {

    return list.flatMap {
        if (it ==0 )
            return listOf()

listOf(it,it)
    }
}

// return returning from top level where  fun is defined
fun duplicateNonZeroNumberWithReturnAtFlatMapLevel(list:List<Int>):List<Int> {

    return list.flatMap {
        if (it ==0 )
            return@flatMap listOf<Int>()

listOf(it,it)
    }
}

// no return keyword to achieve same thing
fun duplicateNonZeroNumberWithNoReturn(list:List<Int>):List<Int> {

    return list.flatMap {
        if (it ==0 )
            listOf<Int>()
        else
            listOf(it,it)
    }
}