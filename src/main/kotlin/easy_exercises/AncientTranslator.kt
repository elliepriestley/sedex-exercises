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

// 2008 -> 2000 8
// 1668 -> 1000, 600, 60, 8

class AncientTranslator {

    fun translate(number: Int): String {
        val brokenUpNumber = breakUpNums(number)
        return encode(brokenUpNumber)
    }

    fun breakUpNums(inputNum: Int):List<String> {
        val brokenUpNumList = ArrayList<String>()
        inputNum.toString().mapIndexed { index, c ->
            if (c != '0') {
                val noOfZeroes: Int = (inputNum.toString().length) - (index + 1)
                val wholeNumber = "$c${"0".repeat(noOfZeroes)}"
                brokenUpNumList.add(wholeNumber)
            }
        }
        return brokenUpNumList
    }

    fun encode(inputList: List<String>): String {
        var romanNumeralsString: String = ""

        inputList.forEach { wholeNumber ->
            if (wholeNumber.first() == '4' || wholeNumber.first() == '9') {
                val prefix = findNearestVitalNumInInt(wholeNumber) - wholeNumber.toInt()
                val numInRomanNumerals =
                    "${turnIntoRomanNumeral(prefix.toString())}${findNearestVitalNumInRomanNumerals(wholeNumber)}"
                romanNumeralsString += numInRomanNumerals
            } else {
                if (wholeNumber.toInt() >= 1000) {
                    romanNumeralsString += "M".repeat(wholeNumber.toInt() / 1000)
                } else if (wholeNumber.toInt() in 500..899) {
                    romanNumeralsString += "D${"C".repeat((wholeNumber.toInt()- 500) / 100)}"
                } else if (wholeNumber.toInt() >= 900) {
                    romanNumeralsString += "CM"
                } else if (wholeNumber.toInt() >= 100) {
                    romanNumeralsString += "C${"L".repeat(wholeNumber.toInt() - 100 / 50)}"
                } else if (wholeNumber.toInt() in 50.. 89) {
                    romanNumeralsString += "L${"X".repeat((wholeNumber.toInt() - 50) / 10)}"
                } else if (wholeNumber.toInt() >= 90) {
                    romanNumeralsString += "XC"
                } else if (wholeNumber.toInt() % 10 == 0) {
                    romanNumeralsString += "X".repeat(wholeNumber.toInt() / 10)
                } else if (wholeNumber.toInt() > 5) {
                    romanNumeralsString += "V${"I".repeat(wholeNumber.toInt()-5)}"
                } else {
                    romanNumeralsString += "I".repeat(wholeNumber.toInt())
                }


            }
        }
        return romanNumeralsString
    }

    fun findNearestVitalNumInInt(inputNum: String): Int {
        val vitalNumbers: List<Int> = listOf(1, 5, 10, 50, 100, 500, 1000)
        val nearestNum: Int = vitalNumbers.filter{it -> it > inputNum.toInt()}.first()
        return nearestNum
    }

    fun findNearestVitalNumInRomanNumerals(inputNum: String): String {
        val vitalNumbers: List<Int> = listOf(1, 5, 10, 50, 100, 500, 1000)
        val nearestNum: Int = vitalNumbers.filter{it -> it > inputNum.toInt()}.first()
        return turnIntoRomanNumeral(nearestNum.toString())
        }
    }

    fun turnIntoRomanNumeral(inputNum: String): String {
        val int = inputNum.toInt()
        return when(int) {
            1 -> "I"
            5 -> "V"
            10 -> "X"
            50 -> "L"
            100 -> "C"
            500 -> "D"
            1000 -> "M"
            else -> {return "Oops"}
    }
}