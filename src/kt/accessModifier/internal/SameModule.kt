package kt.accessModifier.internal

// numberThree is visible because this file is in the same module than Internal.kt
// numberEight is visible because this file is in the same module than User
private val numberEleven = numberThree.plus(User().numberEight)