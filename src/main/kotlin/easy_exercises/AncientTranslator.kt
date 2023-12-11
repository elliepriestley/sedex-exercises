package easy_exercises

class AncientTranslator {

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
}