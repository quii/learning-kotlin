import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class RangesTest{
    @Test
    fun `it gives me a collection of numbers, the last one being 5`() {
        assertThat(5, equalTo(gimme5().last))
    }

    @Test
    fun `it knows that 3 is in 1 to 5`() {
        assert(checkNumberInCollection(3, gimme5()))
    }

    @Test
    fun `it knows that 6 is not in 1 to 5`() {
        assert(!checkNumberInCollection(6, gimme5()))
    }

    @Test
    fun `a number less than 10 is not big`() {
        assertThat("Not very", equalTo(howBigIsYourNumber(9)))
    }
}