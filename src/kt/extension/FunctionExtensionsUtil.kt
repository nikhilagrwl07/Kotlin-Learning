package kt.extension

//this on right hand side of '=' refers to String of left hand side
fun String.lastChar() = get(this.length-1)


fun String.repeat(n:Int): String {
    val sb = StringBuilder(n* this.length)
    for(i in 1..n){
        sb.append(this)
    }
    return sb.toString()
}


fun  List<Int>.sum():Int {
    var result = 0
    for (i in this)
        result += i

    return result
}