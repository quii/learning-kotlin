
/*
In Kotlin, if statements (and other things) are expressions, which is nice.

This is unlike Java where all control structures are statements, so they cannot be
combined as easily
 */

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b : Int) = if (a < b) a else b