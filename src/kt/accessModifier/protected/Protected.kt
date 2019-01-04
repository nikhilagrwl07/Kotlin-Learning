package kt.accessModifier.protected

// Visible inside this file
private const val numberThree = 3

// Visible inside this file
private open class User() { // by default all classes in kotlin are final which means they can't be extended, so marking User class as open to be able to extend

    // Visible inside the User class and subclasses
    protected val numberEight = numberThree.plus(5)
}

// Visible inside this file
private class Moderator() : User() {
    // Visible inside the Moderator class
    // numberEight is visible because Moderator is a subclass of User
    private val numberEleven = numberThree.plus(numberEight)
}

// ERROR: protected modifier is not allowed for top level declarations
//protected const val numberThree = 3

// ERROR: protected modifier is not allowed for top level declarations
//protected class Staff()