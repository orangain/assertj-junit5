import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApplicationTest {
    @Test
    fun testAssertJ() {
        assertThat("a").isEqualTo("b")
    }

    @Test
    fun testJUnit() {
        assertEquals("b", "a")
    }
}