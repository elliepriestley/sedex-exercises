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
    fun breakUpNum(num: Int): ArrayList<String> {
        val resultList = ArrayList<String>()
        num.toString().mapIndexed { index, c ->
            if (c != '0') {
                val numofZeroes = num.toString().length - (index + 1)
                val numString: String = "$c${"0".repeat(numofZeroes)}"
                resultList.add(numString)
            }
        }
        return resultList
    }
    fun encode(num: Int): String {
        val digitList = breakUpNum(num)
        var romanNumeralsString: String = ""
        digitList.forEach { s ->
            if (s.toInt() % 1000 == 0) {
                romanNumeralsString += "M".repeat(s.toInt() / 1000)
            } else if (s.toInt() % 500 == 0) {
                romanNumeralsString += "D".repeat(s.toInt() / 500)
            } else if (s.toInt() % 100 == 0) {
                romanNumeralsString += "C".repeat(s.toInt() / 100)
            } else if (s.toInt() % 50 == 0) {
                romanNumeralsString += "L".repeat(s.toInt() / 50)
            } else if (s.toInt() % 10 == 0) {
                romanNumeralsString += "X".repeat(s.toInt() / 10)
            } else if (s.toInt() > 5) {
                romanNumeralsString += "V${"I".repeat(s.toInt()-5)}"
            } else {
                romanNumeralsString += "I".repeat(s.toInt())
            }
        }
        return romanNumeralsString
    }

//    input:  2008
//    2000
//    8
//    if 8 > 5
//    return 5 + I.repeat(8-5)
//    Expected :MMVIII
//    Actual   :MMIIIIIIII

    // Substraction - if 6 > 100

    // Take a look at Regex
    // Go through the kotlin tool - cover them over the next 2 weeks


}