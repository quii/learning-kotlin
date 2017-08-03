
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

fun aToZ(): String {
    // this is interesting stuff, "with" takes a thing and essentially makes it "this" within the block
    // so in this case, append and toString are methods of StringBuilder
    return with(StringBuilder(), {
        for (letter in 'A'..'Z'){
            append(letter)
        }
        toString()
    })
}

fun aToZLower(): String {
    return StringBuilder().apply {
        for (letter in 'a'..'z') {
            append(letter)
        }
    }.toString()
}