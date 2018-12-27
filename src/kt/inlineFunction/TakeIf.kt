package kt.inlineFunction


fun main(args: Array<String>) {
    val number = 42
    println(number.takeIf { it > 10 })
    println(number.takeIf { it > 52 })

    // takeUnless just does reverse of takeIf
    println(number.takeUnless { it > 10 })
    println(number.takeUnless { it > 52 })


    repeat(10){
        println("Using repeat, current value $it")
    }
}