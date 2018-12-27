package kt.property

import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get() = get(this.length - 1)
    set(value: Char) {
        this.setCharAt(this.length - 1, value)
    }


fun main(args: Array<String>) {

    val sb = StringBuilder("Kotlin?")
    println("Before Change -> $sb")
    sb.lastChar = '!'
    println("After Change ->  $sb")
}