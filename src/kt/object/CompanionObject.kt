package kt.`object`

// Companion object in kotlin is replacement for static methods in java

class A {
    companion object F1 { // Naming companion object is optional and can be ommitted
        fun foo() = 1
    }
}

class C {
    companion object {
        fun foo2() = 2
    }
}


fun main(args: Array<String>) {
    A.F1.foo()
    C.foo2()
}
