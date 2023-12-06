package easy_exercises

class CharacterWithLongestConsecutiveRepetition {

    fun returnCharacter(string: String): Pair<Char?,Int>{
        var mostFrequentChar: Char? = null
        var countofMostFrequentChar: Int = string.filter{it == mostFrequentChar}.length
        string.forEach {char ->
            val countOfIt: Int = string.filter{it == char}.length
            if (countOfIt > countofMostFrequentChar) {
                mostFrequentChar = char
                countofMostFrequentChar = countOfIt
            }
        }
        return Pair(mostFrequentChar, countofMostFrequentChar)
    }
}