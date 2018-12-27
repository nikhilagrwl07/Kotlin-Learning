package kt.`object`

class A{
    companion object {
        fun foo() = 1
    }
}

fun main(args: Array<String>) {
    A.foo() // Companion object in kotlin is replacement for static methods in java
}
