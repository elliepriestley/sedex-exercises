package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AdventOfCode2015DayOneTest {

    @Test
    fun `whatFloor function - when input is ((( the result is 3`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()
        val expected: Int = 3
        // Act
        val actual: Int = underTest.whatFloor("(((")

        // Assert
        assertEquals(expected, actual)
    }
    @Test
    fun `whatFloor function - when input is ))) the result is -3`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()
        val expected: Int = -3

        // Act
        val actual: Int = underTest.whatFloor(")))")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `whatFloor function - output is as expected in test cases`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()

        // Act and Assert
        assertEquals(0, underTest.whatFloor("(())"))
        assertEquals(0, underTest.whatFloor("()()"))
        assertEquals(3, underTest.whatFloor("((("))
        assertEquals(3, underTest.whatFloor("(()(()("))
        assertEquals(3, underTest.whatFloor("))((((("))
        assertEquals(-1, underTest.whatFloor("())"))
        assertEquals(-1, underTest.whatFloor("))("))
        assertEquals(-3, underTest.whatFloor(")))"))
        assertEquals(-3, underTest.whatFloor(")())())"))

    }

    @Test
    fun `firstEntersBasement function - when input is ) output is 1`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()
        val expected: Int = 1

        // Act
        val actual: Int = underTest.firstEntersBasement(")")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `firstEntersBasement function - outputs are as expected in all test cases`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()

        // Act and Assert
        assertEquals(1, underTest.firstEntersBasement(")"))
        assertEquals(5, underTest.firstEntersBasement("()())"))
        assertEquals(15, underTest.firstEntersBasement("((((((())))))))"))
    }
}