package kt.property

fun main(args: Array<String>) {
    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)
}

// defining extension property. Syntax of extension property is very similar to extension function
val String.medianChar get():Char? {

    println("Calculating...")
    return getOrNull(length/2)
}