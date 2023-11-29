package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AlphabeticalSequenceTest {

    @Test
    fun `returns the input string sorted alphabetically`() {
        // Arrange
        val underTest = AlphabeticalSequence()
        val expected: String = "abcde"

        // Act
        val actual: String = underTest.alphaSeq("bdeca")

        // Assert
        assertEquals(expected, actual)
    }



}