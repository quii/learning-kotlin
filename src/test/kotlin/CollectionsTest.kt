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
}