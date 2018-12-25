package kt

fun main(args: Array<String>) {
    val s1:String = "can only be non-nullable"

    val s2:String? = null
    val s3:String? = "can be nullable and non-nullable"


    println(s1.length) // allowed to use inbuilt function only in case of non-nullable
//    println(s2.length) // NOT allowed to use inbuilt function with nullable. Kt compiler complains at compile time


    // Elvis operator
    val lengthOfs2 = s2?.length ?: 0
    println(lengthOfs2)


//    isFoo1(null)
    isFoo3(null)
    println(isFoo4(null))
    println(isFoo4(Name("foo", "foo")))


    val s4: String? = null
    val s5: String? = ""
    println(s4.isEmptyOrNull())
    println(s5.isEmptyOrNull())

    val s6 = "   "
    println(s6.isEmptyOrNull())


}

//Below both are same for finding length of a string which can be empty
fun checkingNullabilityOfNullableTypeWithIfElse(s:String?): Int? {
    if(s!=null)
        return s.length
    else
        return null
}

fun checkingNullabilityOfNullableType(s:String?): Int? = s?.length



fun isFoo1(n: Name) = n.value == "foo"

//fun isFoo2(n: Name?) = n.value == "foo"

// Name is of nullable type
fun isFoo3(n: Name?) = n != null && n.value == "foo"

fun isFoo4(n: Name?) = n?.value == "foo"

data class Name(val name: String, val value: String)


fun foo(list1: List<Int?>, list2: List<Int>?) {
    list1.size
    list2?.size  //#2

    val i: Int? = //#3
        list1.get(0)
    val j: Int? =   // #5
            list2?.get(0) // #6
}

fun  String?.isEmptyOrNull():Boolean {

    if(this==null || this.isEmpty())
        return true

    return false
}