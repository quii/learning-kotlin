import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class ExpressionsTest {

    @Test
    fun `max returns the highest number`(){
        assertThat(10, equalTo(max(5, 10)))
    }

    @Test
    fun `min returns the lowest number`(){
        assertThat(5, equalTo(min(5, 10)))
    }
}