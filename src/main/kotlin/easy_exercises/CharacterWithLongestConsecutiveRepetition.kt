package easy_exercises

class CharacterWithLongestConsecutiveRepetition {
    fun returnCharacter(string: String): Pair<Char?, Int> {
        var mostFrequentConsecutiveChar: Char? = null
        var mostFrequentConsecutiveCharCount: Int = 0
        var counter = 0

        string.forEachIndexed { index, char ->
            if (index == 0) {
                mostFrequentConsecutiveChar = char
                mostFrequentConsecutiveCharCount += 1
                counter += 1
            } else if (char == string[index - 1]) {
                counter += 1
            } else {
                counter = 1
            }
            if (counter > mostFrequentConsecutiveCharCount) {
                mostFrequentConsecutiveCharCount += 1
                mostFrequentConsecutiveChar = char
            }
        }
    return Pair(mostFrequentConsecutiveChar, mostFrequentConsecutiveCharCount)
    }
}

