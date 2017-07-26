import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class EnumsTest {

    @Test
    fun `identify FOM programming languages`() {
        assert(IsFlavourOfTheMonth(ProgrammingLanguage.Rust))
        assert(IsFlavourOfTheMonth(ProgrammingLanguage.Kotlin))
    }

    @Test
    fun `identify programming masters based on pl knowledge`() {
        assertThat("Enlightened master", equalTo(LabelAProgrammer(ProgrammingLanguage.Scala, ProgrammingLanguage.Go)))
        assertThat("Blub", equalTo(LabelAProgrammer(ProgrammingLanguage.CSharp, ProgrammingLanguage.Java)))
    }
}