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
        assertThat(helloWorld(name = "CJ"), equalTo("Hello, CJ"))
    }

    @Test
    fun `i understand let with null`(){
        val name: String? = null

        // thankfully, you cant do this, because it could be null
        // helloWorld(name)

        //you can do this to get round the nullness
        if (name!=null) {
            assertThat(helloWorld(name), equalTo("i wont get called anyway"))
        }

        //but that can get messy, so you can use let, which is kinda like map from any other functional language will null
        val result = name?.let { helloWorld(it) }

        assertThat(null, equalTo(result))

    }
}