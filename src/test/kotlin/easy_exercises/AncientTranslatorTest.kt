package easy_exercises

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
}