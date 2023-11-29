package easy_exercises

/* Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces. */

class AlternateCapitalization {

    fun alternateCapitalize(inputString: String): List<String> {
        val inputList= listOf(inputString, inputString)
        val evenIndicesCapitalized = capitalize(0, inputList[0])
        val oddIndicesCapitalized = capitalize(1, inputList[1])
        return listOf(evenIndicesCapitalized, oddIndicesCapitalized)
    }

    fun capitalize(startingIndex: Int, inputString: String): String {
        var capitalizedString = ""
        if (startingIndex == 0) {
            inputString.forEachIndexed { index, c ->
                if (index % 2 == 0) {
                    capitalizedString += c.uppercase()
                } else {
                    capitalizedString += c
                }
            }
        } else {
            inputString.forEachIndexed { index, c ->
                if (index % 2 != 0) {
                    capitalizedString += c.uppercase()
                } else {
                    capitalizedString += c
                }
            }
        }
        return capitalizedString
    }
}