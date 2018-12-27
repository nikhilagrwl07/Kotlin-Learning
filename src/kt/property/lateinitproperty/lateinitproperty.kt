package kt.property.lateinitproperty

class MyClass {
    lateinit var lateinitvar: String

    fun lateinitInitializationLogic() {
        println(this::lateinitvar.isInitialized)
        lateinitvar = "value"
        println(this::lateinitvar.isInitialized)
    }
}

fun main(args: Array<String>) {
    val myClass = MyClass()
    myClass.lateinitInitializationLogic()
    println(myClass.lateinitvar)
}