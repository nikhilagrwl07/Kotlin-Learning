package kt.inlineFunction

fun main(args: Array<String>) {

    val nullName = getString(0)
    val nonNullName = getString(10)

    // let function introduce new variable under the hood
    nullName?.let { s -> println("printing $s using let function") }
    nonNullName?.let { s -> println("printing $s using let function") }

                 //adding ? means safe access
    getString(0)?.let {
        println(getAddressFromName(it)) // it datatype is Email
    }

    getString(10)?.let {
        println(getAddressFromName(it)) // it datatype is Email
    }
}

fun getString(i: Int): String? {

    val s = when (i) {
        0 -> null
        else -> "Nikhil"
    }

    return s
}

fun getAddressFromName(name: String): String {
    val address = when (name) {
        "Nikhil" -> "Chicago"
        else -> "Ghazipur"
    }
    return address
}