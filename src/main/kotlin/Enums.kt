
/*
This all feels very similar to sealed classes in scala, lets you write nice ADTs which is vital for FP
 */
enum class ProgrammingLanguage {
    Java, Rust, Kotlin, Scala, CSharp, Go;
}

fun ProgrammingLanguage.ExtendMe(): String = "does this work? $this"

/*
This is actually better than scala in that it doesnt compile if you dont cover all the cases

In Scala this is just a warning (at least in 2.10)
 */
fun IsFlavourOfTheMonth(pl: ProgrammingLanguage): Boolean = when(pl) {
    ProgrammingLanguage.Java, ProgrammingLanguage.Scala, ProgrammingLanguage.CSharp -> false
    ProgrammingLanguage.Kotlin, ProgrammingLanguage.Rust, ProgrammingLanguage.Go -> true
}

fun LabelAProgrammer(pl1: ProgrammingLanguage, pl2: ProgrammingLanguage): String {
    return when(setOf(pl1, pl2)) {
        setOf(ProgrammingLanguage.Scala, ProgrammingLanguage.Go) -> "Enlightened master"
        else -> "Blub"
    }
}