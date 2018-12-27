package kt.classModifier

enum class Colour(val r: Int, val g: Int, val b: Int) {
    BLUE(0, 0, 255),
    GREEN(255, 165, 0),
    BLACK(255, 0, 0);  // Semicolon ; is required at the end

    fun rgb() = (r * 256 + g) * 256 + b
}


fun main(args: Array<String>) {
    println(Colour.BLUE)
    println(Colour.BLUE.b)
    println(Colour.BLUE.rgb())
}