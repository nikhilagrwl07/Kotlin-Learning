package kt

import java.io.IOException

fun main(args: Array<String>) {

    val s = "abc"

    val a: Int? = try {
        Integer.parseInt(s)
    } catch (e: NumberFormatException) {
        null
    }

    println(a)
}


//Checked Exception in kotlin does not exist, but for calling java code
//to know about called kotlin code, throws is added in kotlin code demostrating
//checked exceptions
@Throws(IOException::class)
fun bar(){
    throw IOException()
}

