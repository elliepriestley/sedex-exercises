package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReplaceVowelsWithExclamationMarksTest {
    @Test
    fun`when input string has no vowels, it is returned as is`() {
        // Arrange
        val underTest = ReplaceVowelsWithExclamationMarks()
        val expected: String = "bcbcbc"

        // Act
        val actual: String = underTest.replace("bcbcbc")

        // Assert
        assertEquals(expected, actual)
    }
}