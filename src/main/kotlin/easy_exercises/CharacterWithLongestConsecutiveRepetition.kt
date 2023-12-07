package easy_exercises

/*
*
* For a given string s find the character c (or C) with longest consecutive repetition and return:
    Pair(c, l)
    where l (or L) is the length of the repetition. If there are two or more characters with the same l
    *  return the first in order of appearance.

For empty string return:
    Pair(null, 0)
    * */


class CharacterWithLongestConsecutiveRepetition {
    fun returnCharacter(inputString: String): Pair<Char?, Int> {
        var mostFrequentConsecutiveChar: Char? = null
        var mostFrequentConsecutiveCharCount: Int = 0
        var currentCount = 0

        inputString.forEachIndexed { index, currentChar ->
            // if it is the same as the one before
            // input = abba
            if (index  > 0 && currentChar == inputString[index - 1]) {
                currentCount += 1
            } else {
                currentCount = 1
            }
            // if it has surpassed the previous most frequent
            if (currentCount > mostFrequentConsecutiveCharCount) {
                mostFrequentConsecutiveCharCount += 1
                mostFrequentConsecutiveChar = currentChar
            }
        }
        return Pair(mostFrequentConsecutiveChar, mostFrequentConsecutiveCharCount)
    }
}

