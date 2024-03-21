package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ParenthesisDecoderWithStackTest {

    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the correct order, returns true`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(true, decoder.isStringBalanced("()"))
    }

    @Test
    fun `WHEN the input is 2 characters of the same bracket pair, and they are in the incorrect order, returns false`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(false, decoder.isStringBalanced(")("))
    }

    @Test
    fun `WHEN the input contains an odd number of parenthesis, returns false`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(false, decoder.isStringBalanced("((("))
        assertEquals(false, decoder.isStringBalanced("((())))"))
        assertEquals(false, decoder.isStringBalanced("(()))"))
        assertEquals(false, decoder.isStringBalanced(")(())"))

    }

    @Test
    fun `WHEN the input contains a substring, and the length of that substring is even, calculates accurately whether the input string is balanced`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(false, decoder.isStringBalanced("(())((())))"))
        assertEquals(true, decoder.isStringBalanced("()(())"))
        assertEquals(true, decoder.isStringBalanced("((()))"))
        assertEquals(true, decoder.isStringBalanced("(())((()))"))
    }

    @Test
    fun `WHEN the input only contains closing parentheses, returns false`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(false, decoder.isStringBalanced("))))"))
        assertEquals(false, decoder.isStringBalanced(")))"))
    }

    @Test
    fun `Further edge cases return expected result`() {
        val decoder = ParenthesisDecoderWithStack()
        assertEquals(false, decoder.isStringBalanced(")("))
        assertEquals(false, decoder.isStringBalanced("()()("))
        assertEquals(false, decoder.isStringBalanced("((())"))
        assertEquals(false, decoder.isStringBalanced(")()"))
        assertEquals(false, decoder.isStringBalanced(")"))
        assertEquals(true, decoder.isStringBalanced("()"))
        assertEquals(true, decoder.isStringBalanced("(())((()())())"))
        assertEquals(false, decoder.isStringBalanced(")(()))"))

    }




}