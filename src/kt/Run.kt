package kt

val foo1 = run {
    println("Inside runWithInlineFunction method of kotlin and returning 42..")
    42
}

fun main(args: Array<String>) {
    println("Inside Main method...")
    println("$foo1 $foo1")
}