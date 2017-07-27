import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class ExtensionFuncsTest{
    @Test
    fun `can find the last character of a string`(){
        assertThat('o', equalTo("poo".lastChar()))
    }

    @Test
    fun `can extend the functionality of an enum`(){
        assertThat("does this work? Scala", equalTo(ProgrammingLanguage.Scala.ExtendMe()))
    }
}