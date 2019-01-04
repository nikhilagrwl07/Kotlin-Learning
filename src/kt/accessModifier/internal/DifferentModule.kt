package kt.accessModifier.internal

// ERROR: numberThree is not visible because this file is in a different module than Internal.kt
// ERROR: numberEight is not visible because User() is in a different module than Internal.kt
//private const val numberEleven = numberThree.plus(User().numberEight)