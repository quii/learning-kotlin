interface Comedian {
    val name: String
    fun tellAJoke(): String = "knock knock"
}

class JerrySeinfeld : Comedian {
    override val name: String
        get() = "Jerry Seinfeld"

    override fun tellAJoke(): String {
        return "What's the deal with aeroplane food?"
    }
}

class ChrisJames : Comedian {
    override val name: String
        get() = "Chris James"
}