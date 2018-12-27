package kt.classModifier

sealed class Expr1
// sealed class modifier restricts class hierarchy such that all subclasses
// must be located in the same file

class Num1(val value:Int) : Expr1()
class Sum1(val left:Expr1, val right:Expr1) : Expr1()


fun eval1(e:Expr1):Int = when (e) {
    is Num1 -> e.value
    is Sum1 -> eval1(e.left) + eval1(e.right)
}

fun main(args: Array<String>) {
    println(eval1(Sum1(Num1(1), Sum1(Num1(2),Num1(3)))))
}