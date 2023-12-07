package easy_exercises

import java.util.*

class Mumbling {
    fun accum(inputString: String): String {
        var resultString = ""
        inputString.forEachIndexed { index, char ->
            val charString = char.toString()
                .repeat(index +1)
                .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
            resultString += charString
        }
        return resultString
    }
}

// input is ab, output is aBB