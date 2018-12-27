package kt

import java.awt.Point

operator fun Point.plus(other:Point):Point{
    return Point(this.x+other.x, this.y+other.y)
}

// No restriction on receiver type. For example, Int in this case
operator fun Point.times(times:Int):Point{
    return Point(this.x*times, this.y*times)
}

fun main(args: Array<String>) {
    val addedPoint = Point(1, 2).plus(Point(3, 4))
    println(addedPoint.x)
    println(addedPoint.y)

    val timesPoint = Point(1, 2).times(2)
    println(timesPoint.x)
    println(timesPoint.y)


    val immutableList = listOf(1, 2, 3)
    val newImmutableList = immutableList+2 // everytime this is called new list is created
    println(newImmutableList)

    val mutableList = mutableListOf(1, 2, 3)
    mutableList+=4 // storing same list added with newly added element 4
    mutableList.plusAssign(5) // storing same list added with newly added element 4
    println(mutableList)

}