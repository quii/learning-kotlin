import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class VariablesTest {

    @Test
    fun `it tells us whats the best PL`() {
        assertThat("Scala", equalTo(BestProgrammingLanguage()))
    }

    @Test
    fun `it really tells us what the best PL is`(){
        assertThat("Scala", equalTo(ActuallyBestProgrammingLanguage()))
    }

}