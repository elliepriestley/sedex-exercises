package easy_exercises

import com.sun.org.apache.xpath.internal.operations.Bool


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

class ParenthesisDecoder {
    private val parenthesesMaps = mapOf('[' to ']', '(' to ')', '{' to '}')
    // Rules:
    // 1. The second character in a parenthesis pair must be second if they are one after another. DONE
    // () is correct, )( is incorrect
    // {} is correct }{ is incorrect
    // [] is correct ][ is incorrect

    // 2. There must be complete pairs in all parentheses. DONE

    // 3. Algorithm: extract the string from ( to ). If the substring.size is an odd number, it is incorrect. DONE
    // Otherwise, calculate the middle of the string. Check to see if every character
    // between ( and ) are opposite pairs.
    fun areParenthesesBalanced(parenthesesString: String): Boolean {
        val areParenthesesInPairs = areParenthesesPaired(parenthesesString)
        val isStringTwoCharactersAndBalanced = ifStringIsTwoCharacter(parenthesesString)
        val substrings = returnSubstrings(parenthesesString)
        val areAllSubstringSizesEven = substrings.all { it.length % 2 == 0 }

        val isStringTwoCharacters = parenthesesString.length == 2

        return if (isStringTwoCharacters) {
             (areParenthesesInPairs && isStringTwoCharactersAndBalanced)
        } else {
             areParenthesesInPairs && areAllSubstringSizesEven
        }

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

    fun returnSubstrings(parenthesesString: String): List<String> {
        val parenthesesPairs = mapOf('(' to ')', '{' to '}', '[' to ']')
        val parenthesesSubstrings = mutableListOf<String>()

        parenthesesString.forEachIndexed { index, char ->
            if (char in parenthesesPairs.keys) {
                val currentSubstring = parenthesesString.substring(index)
                val valueOfKeyCharIndex  = currentSubstring.indexOfFirst { it == parenthesesPairs[char]}
                val indexOfValueInOverallString = index + valueOfKeyCharIndex
                val substring = parenthesesString.substring(index, indexOfValueInOverallString + 1)
                parenthesesSubstrings.add(substring)
            }
        }
        return parenthesesSubstrings

    }





}