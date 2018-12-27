package kt

fun main(args: Array<String>) {

    // String comparison
    println("bac"<"abc")
    println("abc" <"bac")

    println(null == null)
    println(null == "abc")

    val map = mapOf<Int, String>(
            1 to "One",
            2 to "Two",
            3 to "Three"
    )

    val s = map[1]
    println("map[1] -->  s")

    if("Three" in map.values) { // in keyword is replaced by contains
        println("Three has been found!!")
    }

    if(2 in map) {
        println("2 has been found!!")
    }

    val t = ""
    if(t in "abc".."def"){ // rangeTo convention  --> start..end is changed to start.rangeTo(end)
        // Do something
    }

    for (i in 1..10)
        println(i)

    val oneToHundred:IntRange = 1..100

}