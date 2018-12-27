package kt

import kt.classModifier.Colour
import kt.classModifier.Colour.*

fun main(args: Array<String>) {
    println(getdescription(GREEN))

    println(whenSyntax("Nikhil"))
    println(whenSyntax(""))
    println(whenSyntax(10.234))
    println(whenSyntax(0))
    println(whenSyntax(10))
}


fun getdescription(color: Colour) =
        when (color) {
            BLUE -> "cold"
            GREEN -> "mild"
            BLACK -> "hot"
        }

fun whenSyntax(a: Any): String =
        when (a) { // when keyword with argument
            0 -> "Is number Zero"
            is Int -> "Is a non-zero Integer"
            is String -> "is string of length ${a.length}" // Smart Cast feature of kt(using length only after a is proved to be instanceOf String)
            else -> "other"
        }


