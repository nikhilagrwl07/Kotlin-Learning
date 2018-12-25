package kt

fun main(args: Array<String>) {

    val alice = Person2("alice", 26)

    // invocation is on alice which is type of Person2 rather than Person2 class, so it is bounded member reference attached to alice
    val agelimitPredicate = alice::isOlderThan

    println(agelimitPredicate( 29))

}

data class Person2(val name: String, val age: Int) {
    fun isOlderThan(agelimit: Int) = age > agelimit
}