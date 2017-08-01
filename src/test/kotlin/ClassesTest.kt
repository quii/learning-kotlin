import com.natpryce.hamkrest.assertion.*
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class ClassesTest {

    @Test
    fun `increases a persons age and wishes them well`(){

        // Note the *reference* is immutable but not the stuff inside
        val cj = Person("CJ", 33, "pssssttt")
        val expectedGreet = "Happy Birthday CJ you are now 34"

        assertThat(expectedGreet, equalTo(HappyBirthday(cj)))
        assertThat(34, equalTo(cj.age))

    }

    @Test
    fun `identifies whether people are awesome or not`() {
        assert(Person("CJ", 33, "whisper whisper").IsAwesome)
        assert(!Person("DB", 34, "psssstt").IsAwesome)
    }
}