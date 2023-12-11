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

//    fun encode(inputList: List<String>): String  {
//        inputList.forEach { wholeNumber ->
//            if (wholeNumber.first() == '4') {
//
//            }
//        }
//        return "String"
//    }

    fun findNearestVitalNum(inputNum: String): String {
        val vitalNumbers: List<Int> = listOf(1, 5, 10, 50, 100, 500, 1000)
        var nearestNum: Int? = null
        if (inputNum.first() == '4') {
            nearestNum = vitalNumbers.filter{it -> it > inputNum.toInt()}.first()
        }
        return when(nearestNum) {
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


}