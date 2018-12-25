package kt

fun main(args: Array<String>) {

    // Formatting multiline strings
    val q = """To code,
            #or not to code?..""".trimMargin(marginPrefix = "#")
    println(q)

    // Regex expression
    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    println(regex.matches("15.02.2016"))
    println(regex.matches("15.022.16"))


    // Other useful extension
    val toInt = "123".toInt()
    println(toInt)

    val toDouble = "1e-10".toDouble()
    println(toDouble)


//    val toIntWithException = "xx".toInt()
//    println(toIntWithException)

    val toIntWithNull = "xx".toIntOrNull()
    println(toIntWithNull)

}