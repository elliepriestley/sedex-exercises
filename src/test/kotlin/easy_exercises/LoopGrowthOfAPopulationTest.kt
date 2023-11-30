package easy_exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.lang.Exception
import kotlin.test.assertFailsWith

class LoopGrowthOfAPopulationTest {

    @Test
    fun `a initialPopulation of 100 with percentageIncrease of 0 and 0 additionalPeople and targetPopulation of 100 returns 0`() {
        //arrange
        val loopGrowthOfAPopulation = LoopGrowthOfAPopulation()
        val expected: Int = 0

        //act
        val actual: Int = loopGrowthOfAPopulation.predictYear(100, 0f, 0, 100)

        //assert
        assertEquals(expected, actual)
    }

    @Test
    fun `an initialPopulation of 100 with percentage Increase of 100 and 0 additionalPeople and targetPopulation of 200 returns 1`() {
        // arrange
        val loopGrowthOfAPopulation = LoopGrowthOfAPopulation()
        val expected: Int = 1

        // act
        val actual: Int = loopGrowthOfAPopulation.predictYear(100, 100f, 0, 200)

        // assert
        assertEquals(expected, actual)

    }

    @Test
    fun `an initialPopulation of 100 with percentage increase of 50 and 0 additionalPeople and targetPopulation of 226 returns 3`() {
        // at 0 years population = 100
        // at 1 year population = 150
        // at 2 years population = 225
        // at 3 years population = 337.5

        //arrange
        val loopGrowthOfAPopulation = LoopGrowthOfAPopulation()
        val expected: Int = 3

        //act
        val actual: Int = loopGrowthOfAPopulation.predictYear(100, 50f, 0, 226)

        //assert
        assertEquals(expected, actual)
        // 1000 + 1000 * 0.02 =>
        // first year: 1020
        //. second year 1040.4
        // third year = 1061.2
        // Fourth year = 1082.42
        assertEquals(4, loopGrowthOfAPopulation.predictYear(1000, 2f, 0, 1080))
    }

    @Test
    fun `an initialPopulation of 100 with percentage increase of 50 and 50 additionalPeople and targetPopulation of 573 returns 3`() {
        // at 0 years population = 100
        // at 1 year population = 200
        // at 2 years population = 350
        // at 3 years population = 575

        //arrange
        val loopGrowthOfAPopulation = LoopGrowthOfAPopulation()
        val expected: Int = 3

        //act
        val actual: Int = loopGrowthOfAPopulation.predictYear(100, 50f, 50, 573)

        //assert
        assertEquals(expected, actual)

    }

    @Test
    fun `an initialPopulation of 1500000 with a percentage increase of 2 and a half, 10000 additionalPeople and targetPopulation of 2000000 returns 10`() {

        //arrange
        val loopGrowthOfAPopulation = LoopGrowthOfAPopulation()
        val expected: Int = 10

        //act
        val actual: Int = loopGrowthOfAPopulation.predictYear(1500000, 2.5f, 10000, 2000000)

        //assert
        assertEquals(expected, actual)
    }

    @Test
    fun`an initialPopulation of 1500 with a percentage increase of 5, 100 additionalPeople and targetPopulation of 5000 returns 15`() {
        // Arrange
        val underTest = LoopGrowthOfAPopulation()
        val expected: Int = 15

        // Act
        val actual: Int = underTest.predictYear(1500, 5.0f, 100, 5000)

        // Assert
        assertEquals(expected, actual)
    }
}
// 1500, 5.0, 100, 5000), 15)
