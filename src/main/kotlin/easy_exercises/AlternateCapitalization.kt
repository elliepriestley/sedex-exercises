package easy_exercises

/* Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces. */

class AlternateCapitalization {

    fun capitalize(inputString: String): List<String> {
        val inputList= listOf(inputString, inputString)
        var firstCapitalizedString = ""
        inputList[0].forEachIndexed { index, c ->
            if (index % 2 == 0) {
                firstCapitalizedString += c.uppercase()
            } else {
                firstCapitalizedString += c
            }
        }
        var secondCapitalizedString = ""
        inputList[1].forEachIndexed { index, c ->
            if (index % 2 != 0) {
                secondCapitalizedString += c.uppercase()
            } else {
                secondCapitalizedString += c
            }
        }

        return listOf(firstCapitalizedString, secondCapitalizedString)
    }
}