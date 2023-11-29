package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class AlternateCapitalizationTest {

    @Test
    fun `returns a ListOfStrings, with first element alternatively capitalized starting with index 0, and second element alternatively capitalized starting with index 1`() {
        // Arrange
        val alternateCapitalization = AlternateCapitalization()
        val expected : List<String> = listOf("HeLlO", "hElLo")

        // Act
        val actual: List<String> = alternateCapitalization.capitalize("hello")

        // Assert
        assertEquals(expected, actual)

    }

}