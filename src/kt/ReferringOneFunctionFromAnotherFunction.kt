package kt

fun main(args: Array<String>) {

    val alice = Person3("alice", 26)
}

data class Person3(val name:String, val age:Int){

    fun isOlderThan(agelimit:Int):Boolean {
        return age>agelimit
    }

    // calling isOlderThan() function inside of getAgePredicate() function using this reference
    fun getAgePredicate() = this::isOlderThan
}