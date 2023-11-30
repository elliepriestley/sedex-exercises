package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class GetMiddleCharacterTest {
    @Disabled
    @Test
    fun `when input count is odd, return the middle character of input`() {
        // Arrange
        val underTest = GetMiddleCharacter()
        val expected: String = "b"

        // Act
        val actual: String = underTest.getMiddle("aba")

        // Assert
        assertEquals(expected, actual)
    }


}