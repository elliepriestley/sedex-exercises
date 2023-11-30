package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.expect

class GetMiddleCharacterTest {

    @Test
    fun `an input "a" returns "a"`() {
        val getMiddleCharacter = GetMiddleCharacter()
        val expected = "a"
        val actual = getMiddleCharacter.getMiddle("a")

        assertEquals(expected, actual)
    }

    @Test
    fun `when input length is odd, returns middle character`() {
        // Arrange
        val underTest = GetMiddleCharacter()
        val expected: String = "b"

        // Act
        val actual: String = underTest.getMiddle("aba")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input length is even, returns the two middle characters`() {
        // Arrange
        val underTest = GetMiddleCharacter()
        val expected: String = "ea"

        // Act
        val actual: String = underTest.getMiddle("bead")

        // Assert
        assertEquals(expected, actual)
    }




}