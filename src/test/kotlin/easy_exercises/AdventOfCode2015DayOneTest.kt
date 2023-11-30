package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AdventOfCode2015DayOneTest {

    @Test
    fun `when input is ((( the result is 3`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()
        val expected: Int = 3
        // Act
        val actual: Int = underTest.whatFloor("(((")

        // Assert
        assertEquals(expected, actual)
    }
    @Test
    fun `when input is ))) the result is -3`() {
        // Arrange
        val underTest = AdventOfCode2015DayOne()
        val expected: Int = -3

        // Act
        val actual: Int = underTest.whatFloor(")))")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `output is as expected in test cases`() {
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

}