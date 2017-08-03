
val people = hashMapOf(
        "CJ" to 33,
        "RB" to 32
)

val scores = setOf(1, 2, 10, 5)

fun pooAdder(x: String) = x + "poo"

fun addPooToAll(vararg stuff: String): List<String> {
    return stuff.map(::pooAdder)
}

fun doesPooExist(words: List<String>): Boolean {
    return !words.find { it.toLowerCase()=="poo" }.isNullOrBlank()
}