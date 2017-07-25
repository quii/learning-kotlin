import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

// bit of a shame you need a class for a test
class HelloWorldTest {

    @Test
    fun `it says hello`() {
        assertThat(helloWorld(), equalTo("Hello, world"))
    }
}