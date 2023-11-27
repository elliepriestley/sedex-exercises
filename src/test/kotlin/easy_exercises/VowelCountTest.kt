package easy_exercises

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.expect


class VowelCountTest {

    @Test
    fun `when argument is made up of 5 vowels, 5 is returned` () {
        // Arrange
        val vowelCount = VowelCount()
        val expected: Int = 5

        // Act
        val actual : Int = vowelCount.count("aeiou")

        // Assert
        assertEquals(expected, actual)

    }

    @Test
    fun `when string argument is made of no vowels, 0 is returned` () {
        // Arrange
        val vowelCount = VowelCount()
        val expected = 0

        // Act
        val actual = vowelCount.count("sdfgh")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when argument is made of 2 vowels, 2 is returned` () {
        // Arrange
        val vowelCount = VowelCount()
        val expected: Int = 2

        // Act
        val actual: Int = vowelCount.count("aehjk")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when argument is made of 10 vowels, 10 is returned` () {
        // Arrange
        val vowelCount = VowelCount()
        val expected : Int = 10

        // Act
        val actual : Int = vowelCount.count("aeiouaeiougdvbnm")

        // Assert
        assertEquals(expected, actual)
    }
}