package kt.equalityOperation


fun main(args:Array<String>){
    val int1 = 10
    val int2 = 10

    println(int1 == int2)        // true
    println(int1.equals(int2))   // true
    println(int1 === int2)       // true

    val first = Integer(10)
    val second = Integer(10)

    println(first == second)       //true
    println(first.equals(second))  //true
    println(first === second)      //false


    class EmployeeWithoutDataClass (val name: String)
    val emp1 = EmployeeWithoutDataClass("Nikhil")
    val emp2 = EmployeeWithoutDataClass("Nikhil")

    println(emp1 == emp2)      //false
    println(emp1.equals(emp2)) //false
    println(emp1 === emp2)     //false

    println(emp1.name == emp2.name)       //true
    println(emp1.name.equals(emp2.name))  //true
    println(emp1.name === emp2.name)      //true


    data class EmployeeWithDataClass (val name: String)
    val emp3 = EmployeeWithDataClass("Suneet")
    val emp4 = EmployeeWithDataClass("Suneet")

    println(emp3 == emp4)         //true
    println(emp3.equals(emp4))    //true
    println(emp3 === emp4)        //false

    println(emp3.name == emp4.name)      //true
    println(emp3.name.equals(emp4.name)) //true
    println(emp3.name === emp4.name)     //true
}