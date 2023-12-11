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
            if (s.toInt() >= 1000) {
                romanNumeralsString += "M".repeat(s.toInt() / 1000)
            } else if (s.toInt() in 500..899) {
                romanNumeralsString += "D${"C".repeat((s.toInt()- 500) / 100)}"
            } else if (s.toInt() >= 900) {
                romanNumeralsString += "CM"
            } else if (s.toInt() >= 100) {
                romanNumeralsString += "C${"L".repeat(s.toInt() - 100 / 50)}"
            } else if (s.toInt() in 50.. 89) {
                romanNumeralsString += "L${"X".repeat((s.toInt() - 50) / 10)}"
            } else if (s.toInt() >= 90) {
                romanNumeralsString += "XC"
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

// All possible cases
    // if first index = 1 = 1000(M) or 100(C) or 10(X) or 1(X)
    // if first index = 2 = 2000(MM) or 200(CC) or 20(XX) or 2(II)
    // if first index = 3 = 3000(MMM) or 300(CCC) or 30(XXX) or 3(III)
    // if first index = 4 = 400(CD) or 40(XL) or 4(IV)
    // if first index = 5 = 500(D) or 50(L) or 5(V)
    // if first index = 6 = 600(DC) or 60(LX) or 6(VI)
    // if first index = 7 = 700(DCC) or 70(LXX) or 7(VII)
    // if first index = 8 = 800(DCCC) or 80(LXXX) or 8(VIII)
    // if first index = 9 = 900(CM) or 90 (XC) or 9(IX)

    // Edge cases = 4, 6, 9,

    // if first index is 1, 2, 3, 5, 7, 8 - formula to convert num to roman numerals is:
        // when number >= 1000 - return "M".repeat(s.toInt() / 1000)


//    I II III IV V VI VII VIII IX X
//    Input = 1990
//    Expected: MCMXC
//    Actual: MDCCCCLXXXX

    // Input List (1000, 900, 90)
    // (M = 1000) (CM = 100 less than 1000) (XC = 10 less than 100)


    // 1
    //  600 - 500 = 100. % 100 = 1
    // input 1666
//    Expected :MDCLXVI
    /// list = 1000, 600, 60, 6
    /// ( 1000 = M) , ( 600 = D(500) 100(C))  , (60 = L(50) X(10)), (6 = V(5), I(1))

//    Actual   :MCCCCCCXXXXXXVI


    // Take a look at Regex
    // Go through the kotlin tool - cover them over the next 2 weeks

    // start on track for collections - no output required. Then set exercises will test functional kotlin
    // multithreading

    // split the time -

    // next week - part 1 of word games - will write read me together in a kick off call , start the collections theory reading.
}