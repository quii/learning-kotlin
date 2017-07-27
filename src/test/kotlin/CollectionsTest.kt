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
}