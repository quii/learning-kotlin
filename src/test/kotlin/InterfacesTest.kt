import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class InterfacesTest {
    @Test
    fun `i dont know how to tell jokes but no worries because the interface i extend has one for me`() {
        val cj = ChrisJames()
        assertThat("knock knock", equalTo(cj.tellAJoke()))
    }

    @Test
    fun `Seinfeld can tell his own jokes`(){
        val js = JerrySeinfeld()
        assertThat("What's the deal with aeroplane food?", equalTo(js.tellAJoke()))
    }
}