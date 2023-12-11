package easy_exercises

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AncientTranslatorTest {

    @Test
    fun `breakUpNums function breaks up Ints into representative whole nums as expected `() {
        // Arrange
        val underTest = AncientTranslator()

        // Act and Assert
        assertEquals(listOf("2000", "8"), underTest.breakUpNums(2008))
        assertEquals(listOf("1000", "400", "40", "4"), underTest.breakUpNums(1444))
        assertEquals(listOf("9"), underTest.breakUpNums(9))
        assertEquals(listOf("40", "3"), underTest.breakUpNums(43))
        assertEquals(listOf("200", "90", "1"), underTest.breakUpNums(291))
    }

    @Test
    fun `findNearestVitalNum function - when input is 4, returns V`() {
        // Arrange
        val underTest = AncientTranslator()
        val expected: String = "V"

        // Act
        val actual = underTest.findNearestVitalNum("4")

        // Assert
        assertEquals(expected, actual)
    }
//    @Test
//    fun `encode function - when input is 4, return is IV`() {
//        // Arrange
//        val underTest = AncientTranslator()
//        val expected: String = "IV"
//
//        // Act
//        val actual = underTest.encode(listOf("4"))
//
//        // Assert
//        assertEquals(expected, actual)
//    }
}