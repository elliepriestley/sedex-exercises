package easy_exercises

class Mumbling {
    fun accum(inputString: String): String {
        var resultString = ""
        inputString.forEachIndexed { index, char ->
            resultString += char.toString().repeat(index +1).uppercase()
        }
        return resultString
    }
}

// input is ab, output is aBB