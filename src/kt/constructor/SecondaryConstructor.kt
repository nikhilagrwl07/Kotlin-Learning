package kt.constructor

class Rectangle(val height: Int, val width: Int) {

    constructor(side: Int) : this(side, side) {

        //....
    }
}