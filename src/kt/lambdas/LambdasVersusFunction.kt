package kt.lambdas

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {

    // lambdas can be stored in val but function can't be stored in val
    val isEven:(Int) -> Boolean = {i:Int-> i%2==0}

    fun isEvenFunction(i:Int):Boolean = i%2 ==0

    //val predicate = isEvenFunction //can't store function in val.

    fun isEvenStoringFunctionInVariableWithFunctionReference(i:Int):Boolean = i%2 ==0
    val predicate = ::isEvenStoringFunctionInVariableWithFunctionReference
    println(predicate(10))


    val predicateFunctionAsLambda = {i:Int -> isEvenStoringFunctionInVariableWithFunctionReference(i)} // same as storing lambda expression in variable


}


