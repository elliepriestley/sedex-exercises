package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CharacterWithLongestConsecutiveRepetitionTest {

    @Test
    fun `When input is empty string, returns Pair(null,0)`() {
        // Arrange
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected = Pair(null, 0)

        // Act
        val actual = underTest.returnCharacter("")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is aaaabb, returns Pair('a', 4)`() {
        // Arrange
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected = Pair('a', 4)

        // Act
        val actual = underTest.returnCharacter("aaaabb")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when input is bbbaaabaaaa, returns Pair('a',4)`() {
        // Arrange
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected = Pair('a', 4)

        // Act
        val actual = underTest.returnCharacter("bbbaaabaaaa")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `returns expected results from kata example tests`() {
        // Arrange
        val underTest = CharacterWithLongestConsecutiveRepetition()

        // Act and Assert
        assertEquals(Pair('u', 3), underTest.returnCharacter("cbdeuuu900"))
        assertEquals(Pair('b',5), underTest.returnCharacter("abbbbb"))
        assertEquals(Pair('a',2), underTest.returnCharacter("aabb"))
        assertEquals(Pair(null,0), underTest.returnCharacter(""))
        assertEquals(Pair('b',1), underTest.returnCharacter("ba"))
    }


}