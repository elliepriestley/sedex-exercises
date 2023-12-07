package easy_exercises

/*  Kata Description:
*   Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and returning a
*   string containing the Roman Numeral representation of that integer.
*
*   Modern Roman numerals are written by expressing each digit separately starting with the left most digit and
*   skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting
*   in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
*
*       Example:
*       encode(1000) // should return "M"
*
*       Help:
*       Symbol    Value
        I          1
        V          5
        X          10
        L          50
        C          100
        D          500
        M          1,000
*
*   Remember that there can't be more than 3 identical symbols in a row.
* */

class RomanNumeralsEncoder {

    fun encode(num: Int): String {
        var romanNumeralResult = ""
        if (num % 1000 == 0) {
            romanNumeralResult += "M".repeat(num / 1000)
        }
        return romanNumeralResult
    }
}