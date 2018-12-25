package kt

fun main(args: Array<String>) {

    val t:String?=null

    // Smart Cast
    if(t is String)
    {
        t.toUpperCase() // val t is smart casted to  String type and therefore toUpperCase() is called
    }


    val t2:String?=null
    val t3:String?="Showing usage of Safe Cast"

    // Safe Cast operator as?
    val safeCastResult = (t2 as? String)?.toUpperCase()
    val safeCastResult2 = (t3 as? String)?.toUpperCase()

    println(safeCastResult)
    println(safeCastResult2)


}

fun simpleNullCheckOnString(s:String?): String? {
    return if(s is String) s else null
}

fun smartNullCheckOnString(s:String?): String? {
    return s as? String
}