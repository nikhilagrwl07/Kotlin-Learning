package kt.classModifier

fun main(args: Array<String>) {
    val set1 = setOf<Int>(1,2,3)
    val set2 = setOf<Int>(1,2,3)

    println(set1 == set2) // calls equals() method

    println(set1 === set2) // check reference equality

    //------------------------------------------------------------

    val f1 = Foo("Nikhil", "Agrawal")
    val f2 = Foo("Nikhil", "Agrawal")
    val f3 = f1

    println(f1==f2) // by default equals() method check reference equality
    println(f1==f3) // by default equals() method check reference equality

    val b1 = Bar("Nikhil", "Agrawal")
    val b2 = Bar("Nikhil", "Agrawal")

    println(b1==b2) // equals() method is overridden by data, so it compares for element equality
}

class Foo(val first:String, val last:String)

data class Bar(val first:String, val last:String)