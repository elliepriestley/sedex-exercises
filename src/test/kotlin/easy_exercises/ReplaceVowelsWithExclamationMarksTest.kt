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

    @Test
    fun`when input string is aeiou, return value is !!!!! `() {
        // Arrange
        val underTest = ReplaceVowelsWithExclamationMarks()
        val expected: String = "!!!!!"

        // Act
        val actual: String = underTest.replace("aeiou")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun`when input string is Hi!, return value is H!! `() {
        // Arrange
        val underTest = ReplaceVowelsWithExclamationMarks()
        val expected: String = "H!!"

        // Act
        val actual: String = underTest.replace("Hi!")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun`when input string is AEIOU!, return value is !!!!!! `() {
        // Arrange
        val underTest = ReplaceVowelsWithExclamationMarks()
        val expected: String = "!!!!!!"

        // Act
        val actual: String = underTest.replace("AEIOU!")

        // Assert
        assertEquals(expected, actual)
    }
}