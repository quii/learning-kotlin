
val people = hashMapOf(
        "CJ" to 33,
        "RB" to 32
)

val scores = setOf(1, 2, 10, 5)

fun addPooToAll(vararg stuff: String): List<String> {
    return stuff.map { x -> x + "poo" }
}