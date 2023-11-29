package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.test.expect

class HighestAndLowestTest {

    @Test
    fun `when argument is a string of one character, that character is returned twice`() {
        // Arrange
        val highestAndLowest = HighestAndLowest()
        val expected: String = "2 2"

        // Act
        val actual: String = highestAndLowest.highAndLow("2")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when argument is a string of 2 characters, those characters are returned, separated by a space, with highest no first` () {
        // Arrange
        val highestAndLowest = HighestAndLowest()
        val expected = "2 1"

        // Act
        val actual = highestAndLowest.highAndLow("1 2")

        // Assert
        assertEquals(expected, actual)
        assertEquals("9 -1", highestAndLowest.highAndLow("-1 9"))
    }

    @Test
    fun `when argument is a string of multiple numbers, the return value is highest int and lowest int, separated by a space` () {
        // Arrange
        val highestAndLowest = HighestAndLowest()
        val expected: String = "8 -2"

        // Act
        val actual: String = highestAndLowest.highAndLow("-2 5 7 3 4 8 4")

        // Assert
        assertEquals(expected, actual)
        assertEquals("42 -9", highestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    }

    @Test
    fun `when argument is a string of the two same numbers, both are returned`() {
        // Arrange
        val highestAndLowest = HighestAndLowest()
        val expected: String = "10 10"

        // Act
        val actual: String = highestAndLowest.highAndLow("10 10")

        // Assert
        assertEquals(expected, actual)
    }
}

