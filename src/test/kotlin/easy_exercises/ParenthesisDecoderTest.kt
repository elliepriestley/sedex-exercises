package easy_exercises

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ParenthesisDecoderTest {

    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the correct order, returns true`() {
        val decoder = ParenthesisDecoder()
        assertEquals(true, decoder.areParenthesesBalanced("[]"))
        assertEquals(true, decoder.areParenthesesBalanced("{}"))
        assertEquals(true, decoder.areParenthesesBalanced("()"))
    }

    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the incorrect order, returns false`() {
        val decoder = ParenthesisDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("]["))
        assertEquals(false, decoder.areParenthesesBalanced("}{"))
        assertEquals(false, decoder.areParenthesesBalanced(")("))
    }



}


