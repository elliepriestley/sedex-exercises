package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RomanNumeralsEncoderTest {

    @Test
    fun `when input is 1000, output is M`() {
        // Arrange
        val underTest = RomanNumeralsEncoder()
        val expected: String = "M"

        // Act
        val actual: String = underTest.encode(1000)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is 2000, output is MM`() {
        // Arrange
        val underTest = RomanNumeralsEncoder()
        val expected: String = "MM"

        // Act
        val actual: String = underTest.encode(2000)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is 1500, output is MD`() {
        // Arrange
        val underTest = RomanNumeralsEncoder()
        val expected: String = "MD"

        // Act
        val actual: String = underTest.encode(1500)

        // Assert
        assertEquals(expected, actual)

    }

    @Test
    fun `when input is 21, output is XXI`() {
        // Arrange
        val underTest = RomanNumeralsEncoder()
        val expected: String = "XXI"

        // Act
        val actual: String = underTest.encode(21)

        // Assert
        assertEquals(expected, actual)

    }



}