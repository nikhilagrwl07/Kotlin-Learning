package kt

fun main(args: Array<String>) {
//    println(isLetter('*'))
//    println(isLetter('q'))
//
//    println(isNotDigit('1'))
//    println(isNotDigit('A'))
//
//
//    println(recognize('C'))
//    println(recognize('c'))
//    println(recognize('1'))
//    println(recognize('*'))
//
//    println("Kotlin" in "Java".."Scala")


    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))
}

fun isLetter(c: Char) =
        c in 'a'..'z' || c in 'A'..'Z' // c in 'a'..'z' is compiled to c >= 'a' && c<='z'


fun isNotDigit(c:Char) = c !in '0'..'9'


//Using in command with when
fun recognize(c:Char): String = when(c) {
            in '0'..'9' -> "is digit"
            in 'a'..'z', in 'A'..'Z' -> "is alphabet"
            else -> "I don't know"
        }



fun isValidIdentifier(s: String): Boolean {
    return when {
        s.isEmpty() -> {false}

        s[0] !in 'a'..'z'&& s[0] !in 'A'..'Z' && s[0] != '_'-> {false}

        else -> checkingString(s)

    }
}

fun checkingString(s:String):Boolean {

    var toogle = true
    for(ch in s){

        if(ch !in 'a'..'z'&& ch !in 'A'..'Z' && ch !in '0'..'9' && ch != '_') {
            toogle = false
            break
        }
    }
    return toogle
}