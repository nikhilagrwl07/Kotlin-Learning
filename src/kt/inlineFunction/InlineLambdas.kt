package kt.inlineFunction

// Inline lambdas using inline keyword which introduces no overhead
// as at compile time compiler replaces inline function with function call
fun main(args: Array<String>) {
    val name ="Kotlin"

    runWithLambdaAsArgument{ println("hi! , $name") } // brings performance overhead
    println("hi! , $name")  // simply calling print



    runWithInlineFunction{ println("hi! , $name") } // compiler convert inline function with calling function means no performance overhead
    println("hi! , $name")  // simply calling print
}

fun runWithLambdaAsArgument (f:() -> Unit){
    f()
}

inline fun runWithInlineFunction(f:() -> Unit){
    f()
}
