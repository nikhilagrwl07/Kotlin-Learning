package kt.`object`

interface Factory<T> {
    fun create(): T
}

class B {
    private constructor()

    companion object : Factory<B> {
        override fun create(): B {
            println("Companion object implementing interface in kotlin...")
            return B()
        }
    }
}

fun main(args: Array<String>) {
    B.create()
}