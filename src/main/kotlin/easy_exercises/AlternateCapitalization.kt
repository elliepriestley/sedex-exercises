package easy_exercises

/* Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces. */

class AlternateCapitalization {

    fun alternateCapitalize(inputString: String): List<String> {
        val inputList= listOf(inputString, inputString)
        return listOf(capitalizeByEvenIndex(inputList[0]), capitalizeByOddIndex(inputList[1]))
    }

    fun capitalizeByEvenIndex(inputString: String): String {
        var capitalizedString = ""
        inputString.forEachIndexed { index, c ->
            if (index % 2 == 0) {
                capitalizedString += c.uppercase()
            } else {
                capitalizedString += c
            }
        }
        return capitalizedString
    }

    fun capitalizeByOddIndex(inputString: String): String {
        var capitalizedString = ""
        inputString.forEachIndexed { index, c ->
            if (index % 2 != 0) {
                capitalizedString += c.uppercase()
            } else {
                capitalizedString += c
            }
        }
        return capitalizedString
    }
}