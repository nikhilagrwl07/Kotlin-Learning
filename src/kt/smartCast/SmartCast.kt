package kt.smartCast

interface Shape {
    fun calculateArea(): Float
}


class Circle : Shape {
    var radius: Float = 10.0f
    override fun calculateArea(): Float {
        return (22 * radius * radius) / 7
    }
}

class Square : Shape {
    var sideLength: Float = 10.0f
    override fun calculateArea(): Float {
        return sideLength * sideLength
    }
}

class Rectangle : Shape {
    var length: Float = 10.0f
    var breadth: Float = 5.0f
    override fun calculateArea(): Float {
        return length * breadth
    }
}

fun smartCastUsingIsOperator(shapeObject: Shape) {

    when (shapeObject) {
        is Circle -> {
            print("it’s a Circle")

            shapeObject.radius = 10.0f // Kotlin compiler automatically smartcasted shapeObject to Circle class and so accessed radius circle's member variable
            println(shapeObject.calculateArea())
        }
        is Square -> {
            print("it’s a Square")

            shapeObject.sideLength = 15.0f  // Kotlin compiler automatically smartcasted shapeObject to square class and so accessed sideLength sqaure's member variable
            println(shapeObject.calculateArea())
        }
        is Rectangle -> {
            print("it’s a Rectangle")

            shapeObject.breadth = 9.0f   // Smart Cast
            shapeObject.length = 10.0f   // Smart Cast
            println(shapeObject.calculateArea())
        }
    }
}


fun smartCastWithOrAndOperator(shapeObject: Shape) {

    /* Automatically cast the right-hand side of && to Circle */
    if (shapeObject is Circle && shapeObject.radius > 5.0f) {
        println("Circle with radius more than 5.0")
    }

    /* Automatically cast the right hand side of || to Square */
    if (shapeObject !is Square || shapeObject.sideLength < 3.0f) {
        print("Either not square or is a square with side length less than 3.0f")
    }
}

fun shapeDetailsusingNotIsOperator(shapeObject: Shape) {

    if (shapeObject !is Circle) {
        print("it’s not a Circle")
    } else if (shapeObject !is Square) {
        print("it’s not a Square")
    } else if (shapeObject !is Rectangle) {
        print("it’s not a Rectangle")
    }
}

fun main(args: Array<String>) {

    val shape:Shape = Circle()
    smartCastUsingIsOperator(shape)

    val shape2:Shape = Rectangle()
    smartCastUsingIsOperator(shape2)


    val shape3:Shape = Square()
    smartCastUsingIsOperator(shape3)


    // Safe Cast operator as?
    val safeCastOperatorCircle:Circle? = shape as? Circle
    println(safeCastOperatorCircle?.radius)

    val safeCastOperatorRectangle: Rectangle? = shape as? Rectangle
    println(safeCastOperatorRectangle?.breadth)
    println(safeCastOperatorRectangle?.length)

}