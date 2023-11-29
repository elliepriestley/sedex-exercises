package easy_exercises

/* Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces. */

class AlternateCapitalization {

    fun capitalize(inputString: String): List<String> {
        return listOf(inputString, inputString)
    }
}