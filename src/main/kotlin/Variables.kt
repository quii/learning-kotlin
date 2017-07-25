
// you can declare an immutable value with uh, no value. But the compiler will make sure you dont init it more than once
fun BestProgrammingLanguage(): String {
    val notSet: String

    notSet = "Scala"
    // notSet = "wont work"

    return notSet
}

fun ActuallyBestProgrammingLanguage(): String {
    var bestPL = "Scala"
    bestPL = "Kotlin"
    bestPL = "Scala"
    return bestPL
}