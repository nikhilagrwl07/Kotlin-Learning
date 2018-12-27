package kt.constructor

class Person4(name: String) { // constructor parameter

    val name: String

    init {          // constructor body inside init which us used for adding complicated logic
        this.name = name
    }
}



// Changing visibility of constructor
class InternalComponent internal constructor(name: String)