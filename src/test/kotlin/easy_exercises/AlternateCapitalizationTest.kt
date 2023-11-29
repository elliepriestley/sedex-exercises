package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AlternateCapitalizationTest {

    @Test
    fun `returns a List of Strings, with each element comprised of the same characters as input string (not case sensitive) `() {
        // Arrange
        val altCapitalization = AlternateCapitalization()
        val expected: List<String> = listOf("abcd", "abcd")

        // Act
        val actual: List<String> = altCapitalization.capitalize("abcd")

        // Assert
        assertEquals(expected, actual)
        assertEquals(listOf("fghijk", "fghijk"), altCapitalization.capitalize("fghijk"))
        assertEquals(listOf("iejfk", "iejfk"), altCapitalization.capitalize("iejfk"))
        assertEquals(listOf("helloWorld", "helloWorld"), altCapitalization.capitalize("helloWorld"))
    }
}