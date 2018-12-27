package kt.property.lazyproperty

val lazyValue:String by lazy {
    println("Computing ....")
    "Nikhil"
}


fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}