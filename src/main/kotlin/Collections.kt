
val people = hashMapOf(
        "CJ" to 33,
        "RB" to 32
)

val scores = setOf(1, 2, 10, 5)

fun addPooToAll(vararg stuff: String): List<String> {
    return stuff.map { x -> x + "poo" }
}

fun doesPooExist(words: List<String>): Boolean {
    return !words.find { it.toLowerCase()=="poo" }.isNullOrBlank()
}