package easy_exercises

/*

You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character.
If the word's length is even, return the middle 2 characters.

#Examples:
    Kata.getMiddle("test") should return "es"
    Kata.getMiddle("testing") should return "t"
    Kata.getMiddle("middle") should return "dd"
    Kata.getMiddle("A") should return "A"

#Input
A word (string) of length 0 < str < 1000

#Output
The middle character(s) of the word represented as a string.
 */


// Testing logic
// 1. when input.count is odd, return middle character
// 2. when input.count is even, return middle two characters



class GetMiddleCharacter {
    fun getMiddle(str: String): String {
        return str.substring( (str.length -1 ) /2, (str.length / 2 )+ 1)

    }

    // before refactoring:
//    fun getMiddle(str: String): String {
//        val length: Int = str.length
//        if (length % 2 == 0) {
//            val firstIndex: Int = ((length)/2) -1  // (index = 1)
//            val secondIndex: Int = ((length)/2)  // (index = 2)
//            return str.slice(firstIndex..secondIndex)
//        } else {
//            val middleIndex: Int = ((length + 1)/2) -1  // 1
//            return str[middleIndex].toString()
//        }
//
//
//    }

}