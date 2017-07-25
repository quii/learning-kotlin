import org.junit.Test

class EnumsTest {

    @Test
    fun `identify FOM programming languages`() {
        assert(IsFlavourOfTheMonth(ProgrammingLanguage.Rust))
        assert(IsFlavourOfTheMonth(ProgrammingLanguage.Kotlin))
    }
}