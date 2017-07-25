import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class ClassesTest {

    @Test
    fun `increases a persons age and wishes them well`(){

        // Note the *reference* is immutable but not the stuff inside
        val cj = Person("CJ", 33)
        val expectedGreet = "Happy Birthday CJ you are now 34"

        assertThat(expectedGreet, equalTo(HappyBirthday(cj)))
        assertThat(34, equalTo(cj.age))

    }
}