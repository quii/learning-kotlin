import com.natpryce.hamkrest.assertion.*
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldNotMatch
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

    @Test
    fun `can use sideeffecty class to do fun things`(){
        val thing = SideEffectyConstructors("pants")
        assertThat("Poo pants", equalTo(thing.phrase))
    }

    @Test
    fun `multiple constructors`(){
        val a = MultipleConstructors("CJ")
        val b = MultipleConstructors("DB")
        val c = MultipleConstructors(5)

        assertThat(10, equalTo(a.score))
        assertThat(2, equalTo(b.score))
        assertThat(5, equalTo(c.score))
    }


    @Test
    fun `data classes provide toEquals amongst other boring things`(){
        val scoreA = Score(10, "CJ")
        val scoreB = Score(10, "CJ")
        val scoreC = scoreB.copy(participant = "DB")
        assertThat(scoreA, equalTo(scoreB))
        assertThat(scoreC, !equalTo(scoreB))
    }
}