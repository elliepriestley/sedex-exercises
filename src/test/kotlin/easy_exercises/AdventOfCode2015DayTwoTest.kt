package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AdventOfCode2015DayTwoTest {

    @Test
    fun `when input is a list of one element with dimensions of 2x3x4, return value is 58`() {
        // Arrange
        val underTest = AdventOfCode2015DayTwo()
        val expected: Int = 58

        // Act
        val actual: Int = underTest.howMuchWrappingPaper(listOf("2x3x4"))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is a list of one element with dimensions of 1x1x10, return value is 43`() {
        // Arrange
        val underTest = AdventOfCode2015DayTwo()
        val expected: Int = 43

        // Act
        val actual: Int = underTest.howMuchWrappingPaper(listOf("1x1x10"))

        // Assert
        assertEquals(expected, actual)

    }

    @Test
    fun `when input is a list of two elements with dimensions of 2x3x4, and 1x1x10, return value is 101`() {
        // Arrange
        val underTest = AdventOfCode2015DayTwo()
        val expected: Int = 101

        // Act
        val actual: Int = underTest.howMuchWrappingPaper(listOf("2x3x4", "1x1x10"))

        // Assert
        assertEquals(expected, actual)
    }

}