package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.rmi.AlreadyBoundException

class AlphabeticalSequenceTest {

    @Disabled // test is no longer fitting the criteria - kept for learning
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

    @Disabled // test is no longer fitting the criteria - kept for learning
    @Test
    fun `returns input string sorted alphabetically, where each element appears as many times as its respective place in the alphabet`() {
        // Arrange
        val underTest = AlphabeticalSequence()
        val expected: String = "abbcccddddeeeee"

        // Act
        val actual: String = underTest.alphaSeq("abcde")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `returns input string sorted alphabetically, where each element appears as many times as its respective place in the alphabet, separated by commas`() {
        // Arrange
        val underTest = AlphabeticalSequence()
        val expected: String = "eeeee,ggggggg,llllllllllll,nnnnnnnnnnnnnn,nnnnnnnnnnnnnn,pppppppppppppppp,qqqqqqqqqqqqqqqqq,rrrrrrrrrrrrrrrrrr,uuuuuuuuuuuuuuuuuuuuu,xxxxxxxxxxxxxxxxxxxxxxxx,zzzzzzzzzzzzzzzzzzzzzzzzzz"

        // Act
        val actual: String = underTest.alphaSeq("ZpglnRxqenU")

        // Assert
        assertEquals(expected, actual)

    }
}