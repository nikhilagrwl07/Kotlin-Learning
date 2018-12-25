package kt

fun main(args: Array<String>) {
    println(ExtensionWinsOverMember().foo())
}

class ExtensionWinsOverMember {
    fun foo() =1
}

// Member always win in precedence over extensions
fun ExtensionWinsOverMember.foo() = 2


