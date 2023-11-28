package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.expect

class GrowthOfAPopulationTest {

    @Test
    fun `when startingPopulation is 100, percentageIncrease is 0, additionalPeople is 0 and targetPopulation is 100, the result is 0`() {
        // Arrange
        val growthOfPopulation = GrowthOfAPopulation()
        val expected: Int = 0

        // Act
        val actual = growthOfPopulation.predictYear(100, 0.0f, 0, 100)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when startingPopulation is 100, percentageIncrease is 100, additionalPeople is 0 and targetPopulation is 200, the result is 1`() {
        // Arrange
        val growthOfPopulation = GrowthOfAPopulation()
        val expected: Int = 1

        // Act
        val actual: Int = growthOfPopulation.predictYear(100, 100.0f, 0, 200)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `when startingPopulation is 100, percentageIncrease is 50, additionalPeople is 0 and targetPopulation is 226, the result is 3`() {
        // At the end of the first year there will 150
        // at the end of the second year there will be 225
        // at the end of the third year there will be 337.5

        // Arrange
        val growthOfAPopulation = GrowthOfAPopulation()
        val expected: Int = 3

        // Act
        val actual: Int = growthOfAPopulation.predictYear(100, 50f, 0, 226)

        // Assert
        assertEquals(expected, actual)
    }



}