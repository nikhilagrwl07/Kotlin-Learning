package kt


fun main(args: Array<String>) {

    val namedArgumentExample = listOf('a', 'b', 'c').joinToString(
                                                                separator = "",
                                                                prefix = "(",
                                                                postfix = ")")

    println(namedArgumentExample)
}