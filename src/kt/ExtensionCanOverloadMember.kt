package kt

fun main(args: Array<String>) {
    println(ExtensionCanOverloadMember().foo(2))
}


class ExtensionCanOverloadMember {
    fun foo() = "member"
}

// Extension can't completely hide a member but can overload it
fun ExtensionCanOverloadMember.foo(i:Int) = "extensions($i)"





