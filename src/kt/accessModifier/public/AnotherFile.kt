package kt.accessModifier.public

/// numberThree is visible to any other file because it's public
// numberEight is visible to any other file because User and numberEight are public
// numberEleven is visible to any other file because Moderator and numberEleven are public
public val numberTwentyTwo = numberThree + User().numberEight + Moderator().numberEleven