package kt

import kotlin.test.fail

fun main(args: Array<String>) {

    val lengthOfString = getlengthOfString()
    println(lengthOfString)
}

fun getlengthOfString(): Int? {
    val s: String? = null

    if (s == null)
        fail() // failing at this point by throwing java.lang.AssertionError

    return s.length // can safely access now. Known as smart cast as compiler knows it can access safely now
}

