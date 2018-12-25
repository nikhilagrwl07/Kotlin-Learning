package kt

fun main(args: Array<String>) {

    val people = listOf<Person1>(
            Person1("Nikhil", 26),
            Person1("Ritu", 29))

    val maxBy = people.maxBy(Person1::age) //(ClassName::Member)
    println(maxBy)


    // invocation is on Person1 class, so it is unbounded member reference attached to class Person1 rather than any object
    val agelimitPredicate = Person1::isOlderThan

    val alice = Person1("alice", 26)

    println(agelimitPredicate(alice,29))

}

data class Person1(val name:String, val age:Int){
    fun isOlderThan(agelimit:Int):Boolean {
        return age>agelimit
    }
}