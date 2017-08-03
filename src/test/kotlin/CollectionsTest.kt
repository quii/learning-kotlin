import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class CollectionsTest{

    @Test
    fun `can find peoples ages by initials`() {
        assertThat(people.get("CJ"), equalTo(33))
    }

    @Test
    fun `can find the highest number in a set`(){
        assertThat(10, equalTo(scores.max()))
    }

    @Test
    fun `can append poo to everything`(){
        assertThat(listOf("apoo", "bpoo"), equalTo(addPooToAll("a", "b")))
    }

    @Test
    fun `it can detect poo`() {
        val stuff = listOf("butts", "cats", "poO", "cakes")
        assert(doesPooExist(stuff))
    }

    @Test
    fun `it can confirm no poo exists`() {
        val stuff = listOf("butts", "cats", "sweets", "cakes")
        assert(!doesPooExist(stuff))
    }

    @Test
    fun `it can find the highest score`(){
        val scores = listOf(
                Score(20, "CJ"),
                Score(50, "RB"),
                Score(99, "PJB")
        )

        assertThat(findHighestScore(scores), equalTo(99))
    }

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    @Test
    fun `i know the alphabet`() {
        assertThat(alphabet, equalTo(aToZ()))
    }

    @Test
    fun `i know the alphabet lowercased`() {
        assertThat(alphabet.toLowerCase(), equalTo(aToZLower()))
    }
}