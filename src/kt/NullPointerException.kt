package kt

fun main(args: Array<String>) {
    val s : String ? = null

    s!! // throwing NullPointerException

    println(s.length) // safe to use here as NPE is already handled by s!!
}
