package kt.accessModifier.internal

// Visible to everyone in the same module
internal const val numberThree = 3

// Visible to everyone in the same module
class User() {
    // Visible to everyone in the same module that has visibility on User
    internal val numberEight = numberThree.plus(5)
}