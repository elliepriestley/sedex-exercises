package easy_exercises

// In this little assignment you are given a string of space separated numbers,
// and have to return the highest and lowest number.
// All numbers are valid Int32, no need to validate them.
// There will always be at least one number in the input string.
// Output string must be two numbers separated by a single space, and highest number is first.
class HighestAndLowest {

    fun highAndLow(string: String): String {
        val stringList: List<String> = string.split(" ")
        if (stringList.count() == 1) {
            return string
        } else {
            val intList = stringList.map { it.toInt()}
            return "${intList.max()} ${intList.min()}"
        }
    }
}