import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class SealedTest{
    @Test
    fun `can print nice title for an article`(){
        val article = Content.Article("CJ rulz", "Journal of Truth")
        assertThat("CJ rulz - Journal of Truth", equalTo(PrintContentTitle(article)))
    }
}