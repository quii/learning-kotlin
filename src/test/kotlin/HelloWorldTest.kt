import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

// bit of a shame you need a class for a test
class HelloWorldTest {

    @Test
    fun `it says hello`() {
        assertThat(helloWorld(), equalTo("Hello, world"))
    }

    @Test
    fun `can say hello to specific people`() {
        assertThat(helloWorld("CJ"), equalTo("Hello, CJ"))
    }
}