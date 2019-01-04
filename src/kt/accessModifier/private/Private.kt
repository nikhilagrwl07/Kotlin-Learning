package kt.accessModifier.private

// Visible just inside this file
private const val numberThree = 3

// Visible just inside this file
private class User() {
    // Visible just inside the user class
    private val numberEight = numberThree.plus(5)
//    private val numberEight2 = numberSeven.plus(5) // numberSeven is defined as private in another another file,so not accessible
}