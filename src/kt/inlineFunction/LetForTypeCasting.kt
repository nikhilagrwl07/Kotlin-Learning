package kt.inlineFunction

fun analyzeSession(session:Session){

    // One way to check type of user
    val user = session.user
    if(user is  FacebookUser){
        println(user.name)
    }

    // Writing above 3 line of code using inline let function
    (session.user as? FacebookUser)?.let {
        println(it.name)
    }
}

class CurrentGmailSession:Session {
    override val user: User
        get() = GmailUser()
}

class CurrentFacebookSession:Session {
    override val user: User
        get() = FacebookUser()
}

interface Session{
    val user:User
}

class FacebookUser : User {
    override val name: String
        get() = "FacebookUser"
    override val SSN: String
        get() = "123"
}

class GmailUser : User {
    override val name: String
        get() = "GmailUser"
    override val SSN: String
        get() = "234"
}


interface User{
    val name:String
    val SSN:String
}

fun main(args: Array<String>) {

    analyzeSession(CurrentFacebookSession())
    analyzeSession(CurrentGmailSession())
}