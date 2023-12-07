package easy_exercises

import java.util.*

/*
*
* This time no story, no theory. The examples below show you how to write function accum:

Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    *
The parameter of accum is a string which includes only letters from a..z and A..Z.*/

class Mumbling {
    fun accum(inputString: String): String {
        var resultString = ""
        inputString.forEachIndexed { index, char ->
            val charString = char.toString()
                .repeat(index +1)
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
            resultString += "${charString}-"
        }
        return resultString.dropLast(1)
    }
}

// input is ab, output is aBB