package easy_exercises
/*
* Description:
    Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

* Examples:
    replace("Hi!") === "H!!"
    replace("!Hi! Hi!") === "!H!! H!!"
    replace("aeiou") === "!!!!!"
    replace("ABCDE") === "!BCD!"*/

class ReplaceVowelsWithExclamationMarks {

    fun replace(s: String): String {
        return s.map {
            if (it.lowercase() in "aeiou") '!' else it }
            .joinToString("")
    }


}