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
        return inputString
            .mapIndexed { index, char ->
                char.toString()
                    .lowercase()
                    .repeat(index + 1)
                    .replaceFirstChar { it.titlecase() }
            }.joinToString("-")
    }
}

// input is ab, output is aBB