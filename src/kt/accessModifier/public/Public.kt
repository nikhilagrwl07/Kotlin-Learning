package kt.accessModifier.public

// Visible everywhere
public const val numberThree = 3

// Visible everywhere
public open class User() {
    // Visible to everyone with visibility on the User class
    public val numberEight = numberThree.plus(5)
}

public open class User2() {
    // Visible to everyone with visibility on the User class
    public val numberEight = numberThree.plus(5)
}

// Visible everywhere
public class Moderator() {
    // numberEleven is visible to everyone with visibility on the Moderator class
    // numberEight is visible because User is public and numberEight is public
    public val numberEleven = numberThree + User2().numberEight
}