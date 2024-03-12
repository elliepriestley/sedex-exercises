package easy_exercises


/**
 * Write a function to determine if the parentheses (), the brackets [], and the braces {}, in a string are balanced.
 *
 * For example:
 *
 *      `)(` is not balanced because `)` comes before `(`
 *
 *      `({)}` is not balanced because `)` is not balanced between `{}`
 *      and similarly the `{` is not balanced between `()`
 *
 *      `[({})]` is balanced
 *
 *      `{}([])` is balanced
 *
 *      `{()}[[{}]]` is balanced
 */

class ParenthesesDecoder {
    // Rules:
    // 1. The second character in a parenthesis pair must be second if they are one after another. DONE
    // () is correct, )( is incorrect
    // {} is correct }{ is incorrect
    // [] is correct ][ is incorrect

    // 2. There must be complete pairs in all parentheses. DONE

    // 3. Substrings must be balanced extract the string from ( to ). If the substring.size is an odd number, it is incorrect. DONE
    // Otherwise, calculate the middle of the string. Check to see if every character
    // between ( and ) are opposite pairs.

    // 4. Substrings must not be just made up of closing parentheses, e.g. "}]))"
    fun areParenthesesBalanced(parenthesesString: String): Boolean {
        val parenthesesAreInPairs = areParenthesesPaired(parenthesesString)
        val inputStringIsTwoCharactersAndBalanced = ifStringIsTwoCharacter(parenthesesString)
        val substringList = returnSubstrings(parenthesesString)
        val allSubstringSizesAreEven = substringList.all { it.length % 2 == 0 }
        val allSubStringsAreBalanced = areAllSubStringsBalanced(substringList)
        val isInputStringBalanced = isInputStringBalanced(parenthesesString)
        val inputStringContainsOpeningChars = doesInputStringContainAnyOpeningParameters(parenthesesString)

        val isStringTwoCharacters = parenthesesString.length == 2

        return if (isStringTwoCharacters) {
             parenthesesAreInPairs && inputStringIsTwoCharactersAndBalanced
        } else {
            (parenthesesAreInPairs && allSubstringSizesAreEven && allSubStringsAreBalanced && inputStringContainsOpeningChars && isInputStringBalanced)
        }

    }

    private fun isInputStringBalanced(inputString: String): Boolean {
        var balance = 0
        inputString.forEach { char ->
            when (char) {
                '{', '[', '(' -> balance++
                '}', ']', ')' -> balance--
            }
        }
        return balance == 0
    }

    private fun doesInputStringContainAnyOpeningParameters(parenthesesString: String): Boolean {
        val openingCharacters = "({["
        val count = parenthesesString.count{it in openingCharacters}
        return count > 0
    }

    private fun areAllSubStringsBalanced(strings: List<String>): Boolean {
        val result = mutableListOf<Boolean>()
        strings.forEach { string ->
            var balance = 0
            string.forEach { char ->
                when (char) {
                    '{', '[', '(' -> balance++
                    '}', ']', ')' -> balance--
                }
                if (balance < 0) {
                    result.add(false)
                }
            }
            result.add(balance == 0)
        }
        return !result.contains(false)
    }

    private fun ifStringIsTwoCharacter(parenthesesString: String): Boolean {
        return when (parenthesesString) {
            "()" -> true
            "{}" -> true
            "[]" -> true
            else -> false
        }
    }

    private fun areParenthesesPaired(parenthesesString: String): Boolean {
        var brackets = 0
        var braces = 0
        var parenthesis = 0

        parenthesesString.forEach { char ->
            when (char) {
                '(' -> parenthesis += 1
                ')' -> parenthesis += 1
                '{' -> braces += 1
                '}' -> braces += 1
                '[' -> brackets += 1
                ']' -> brackets += 1
            }
        }
        return brackets % 2 == 0 && braces % 2 == 0 && parenthesis % 2 == 0
    }

    private fun returnSubstrings(parenthesesString: String): List<String> {
        val parenthesesPairs = mapOf('(' to ')', '{' to '}', '[' to ']')
        val parenthesesSubstrings = mutableListOf<String>()
        var startIndex = -1

        parenthesesString.indices.forEach { i ->
            val char = parenthesesString[i]
            if (char in parenthesesPairs.keys) {
                startIndex = i
            } else if (char in parenthesesPairs.values && startIndex != -1) {
                val openingChar = parenthesesString[startIndex]
                if (parenthesesPairs[openingChar] == char) {
                    parenthesesSubstrings.add(parenthesesString.substring(startIndex, i + 1))
                    startIndex = -1
                }
            }
        }
        return parenthesesSubstrings
    }





}