package easy_exercises

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ParenthesesDecoderTest {
    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the correct order, returns true`() {
        val decoder = ParenthesesDecoder()
        assertEquals(true, decoder.areParenthesesBalanced("[]"))
        assertEquals(true, decoder.areParenthesesBalanced("{}"))
        assertEquals(true, decoder.areParenthesesBalanced("()"))
    }

    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the incorrect order, returns false`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("]["))
        assertEquals(false, decoder.areParenthesesBalanced("}{"))
        assertEquals(false, decoder.areParenthesesBalanced(")("))
    }

    @Test
    fun `WHEN the input contains an odd number of parenthesis, returns false`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("[[["))
        assertEquals(false, decoder.areParenthesesBalanced("{()[]}})"))
        assertEquals(false, decoder.areParenthesesBalanced("[({})]]"))
        assertEquals(false, decoder.areParenthesesBalanced("({)}}"))
        assertEquals(false, decoder.areParenthesesBalanced(")([]]"))

    }
    @Test
    fun `WHEN the input contains a substring, and the length of that substring is an odd number, returns false`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("({)}"))
        assertEquals(false, decoder.areParenthesesBalanced("[(]){}[]"))
        assertEquals(false, decoder.areParenthesesBalanced("{}([]){[}]"))
    }

    @Test
    fun `WHEN the input contains a substring, and the length of that substring is even, calculates accurately whether the input string is balanced`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("{()}[[{}]]]"))
        assertEquals(true, decoder.areParenthesesBalanced("{}([])"))
        assertEquals(true, decoder.areParenthesesBalanced("[({})]"))
        assertEquals(true, decoder.areParenthesesBalanced("{()}[[{}]]"))
    }

    @Test
    fun `WHEN the input only contains closing parentheses, returns false`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced("]})]"))
        assertEquals(false, decoder.areParenthesesBalanced(")))"))
        assertEquals(false, decoder.areParenthesesBalanced("}}}}}}"))
        assertEquals(false, decoder.areParenthesesBalanced("]]}}))"))
        assertEquals(false, decoder.areParenthesesBalanced("}}))))}}"))
    }

    @Test
    fun `Further edge cases return expected result`() {
        val decoder = ParenthesesDecoder()
        assertEquals(false, decoder.areParenthesesBalanced(")("))
        assertEquals(false, decoder.areParenthesesBalanced("()()("))
        assertEquals(false, decoder.areParenthesesBalanced("((())"))
        assertEquals(false, decoder.areParenthesesBalanced(")()"))
        assertEquals(false, decoder.areParenthesesBalanced(")"))
        assertEquals(true, decoder.areParenthesesBalanced("()"))
        assertEquals(true, decoder.areParenthesesBalanced("(())((()())())"))
        assertEquals(false, decoder.areParenthesesBalanced(")(()))"))

    }

}


