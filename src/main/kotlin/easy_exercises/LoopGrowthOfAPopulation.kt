package easy_exercises

class LoopGrowthOfAPopulation {

    fun predictYear(initialPopulation: Int, percentageIncrease: Float, additionalPeople: Int, targetPopulation: Int): Int {
        if (initialPopulation == targetPopulation) {
            return 0
        } else {
            var yearsCount: Int = 0
            var currentPopulation = initialPopulation

            while (currentPopulation < targetPopulation) {
                yearsCount += 1
                currentPopulation = calculateCurrentPopulation(currentPopulation, percentageIncrease)
                currentPopulation += additionalPeople
            }
            return yearsCount
        }
    }


    fun calculateCurrentPopulation(currentPop: Int, percentageIncrease: Float): Int {
        return (currentPop + currentPop * (percentageIncrease / 100)).toInt()

    }
}