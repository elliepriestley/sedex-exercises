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

}