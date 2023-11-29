package easy_exercises

/* Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces. */

class AlternateCapitalization {

    fun alternateCapitalize(inputString: String): List<String> {
        var capitalizedOddString = ""
        var capitalizedEvenString = ""
        inputString.forEachIndexed { index, c ->
            if (index % 2 == 0) {
                capitalizedEvenString += c.uppercase()
                capitalizedOddString += c
            } else {
                capitalizedOddString += c.uppercase()
                capitalizedEvenString += c

            }
        }
        return listOf(capitalizedEvenString, capitalizedOddString)
    }

}