package kt

fun main(args: Array<String>) {

//    val c = "abcd".lastChar()
//
//    println(c)
//
//    println(listOf(1,2,3,4).sum())


    val parent: Parent = Child()
    println(parent.foo())

}


open class Parent
class Child : Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"
