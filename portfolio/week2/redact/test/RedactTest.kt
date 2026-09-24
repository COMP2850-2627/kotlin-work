// Tests for redact()
// DO NOT ALTER ANYTHING IN THIS FILE!

import kotlin.test.Test
import kotlin.test.assertEquals

class RedactTest {
    @Test
    fun `Redaction of empty string is an empty string`() {
        val result = redact("", "Hello")
        assertEquals("", result)
    }

    @Test
    fun `String without target text is left unchanged`() {
        val result = redact("Goodbye World!", "Hello")
        assertEquals("Goodbye World!", result)
    }

    @Test
    fun `String unchanged if redaction target is empty`() {
        val result = redact("Hello World!", "")
        assertEquals("Hello World!", result)
    }

    @Test
    fun `All occurrences of target text are replaced correctly`() {
        val result = redact("Hello COMP2850, Hello World!", "Hello")
        assertEquals("XXXXX COMP2850, XXXXX World!", result)
    }

    @Test
    fun `Different amounts of target text can be redacted`() {
        val result = redact("Goodbye World!", "Goodbye")
        assertEquals("XXXXXXX World!", result)
    }

    @Test
    fun `Alternative redaction character can be specified`() {
        val result = redact("Hello World!", "World", '-')
        assertEquals("Hello -----!", result)
    }
}
