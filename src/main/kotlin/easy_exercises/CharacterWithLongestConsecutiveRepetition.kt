package easy_exercises

/*
*
* For a given string s find the character c (or C) with longest consecutive repetition and return:
    Pair(c, l)
    where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.

For empty string return:
    Pair(null, 0)
    * */


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

