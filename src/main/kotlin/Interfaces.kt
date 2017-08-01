interface Comedian {
    fun tellAJoke(): String = "knock knock"
}

class JerrySeinfeld : Comedian {
    override fun tellAJoke(): String {
        return "What's the deal with aeroplane food?"
    }
}

class ChrisJames : Comedian