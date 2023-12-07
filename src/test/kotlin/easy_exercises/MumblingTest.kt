package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MumblingTest {
    @Test
    fun `when input is a, returns A`() {
        // Arrange
        val underTest = Mumbling()
        val expected: String = "A"

        // Act
        val actual: String = underTest.accum("a")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is ab, output is ABB`() {
        // Arrange
        val underTest = Mumbling()
        val expected: String = "ABB"

        // Act
        val actual: String = underTest.accum("ab")

        // Assert
        assertEquals(expected, actual)
    }


}