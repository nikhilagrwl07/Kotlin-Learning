package kt.`object`

// by default all object in kotlin is singleton
// object = singleton

object SingletonInKotlin{ // by using keyword object we are creating object and it's class in one place
    fun foo(){

    }
}

fun main(args: Array<String>) {
    SingletonInKotlin.foo()
}