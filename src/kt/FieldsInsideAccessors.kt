package kt

class StateLogger{
    var state = false
    var state2 = false

    set(value) {
        println("state has been changed  $field --> $value")
        field = value
    }
}


fun main(args: Array<String>) {
    // Accessing field name state of StateLogger from Main class
    StateLogger().state = true
//    StateLogger().state2 = true
}