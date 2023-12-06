package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CharacterWithLongestConsecutiveRepetitionTest {

    @Test
    fun `When input is empty string, returns null`() {
        // Arrange
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected = Pair(null, 0)

        // Act
        val actual = underTest.returnCharacter("")

        // Assert
        assertEquals(expected, actual)

    }

}