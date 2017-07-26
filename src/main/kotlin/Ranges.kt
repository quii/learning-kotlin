import com.sun.org.apache.xpath.internal.operations.Bool

fun gimme5() = 1..5

fun checkNumberInCollection(needle: Int, haystack: Iterable<Int>): Boolean{
    return needle in haystack
}

fun howBigIsYourNumber(num: Int): String {
    return when(num) {
        in 0..9 -> "Not very"
        in 10..100 -> "Quite big"
        else -> "this code makes me feel uncomfortable"
    }
}