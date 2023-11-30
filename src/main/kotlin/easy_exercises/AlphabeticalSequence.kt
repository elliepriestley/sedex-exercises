package easy_exercises

import java.util.*

/*
In this kata you will be given a random string of letters and tasked with returning them as a string of comma-separated sequences
sorted alphabetically, with each sequence starting with an uppercase character followed by n-1 lowercase characters, where n is
the letter's alphabet position 1-26.

Example
alphaSeq("ZpglnRxqenU") -> "Eeeee,Ggggggg,Llllllllllll,Nnnnnnnnnnnnnn,Nnnnnnnnnnnnnn,Pppppppppppppppp,
Qqqqqqqqqqqqqqqqq,Rrrrrrrrrrrrrrrrrr,Uuuuuuuuuuuuuuuuuuuuu,Xxxxxxxxxxxxxxxxxxxxxxxx,Zzzzzzzzzzzzzzzzzzzzzzzzzz"

Technical Details
    The string will include only letters.
    The first letter of each sequence is uppercase followed by n-1 lowercase.
    Each sequence is separated with a comma.
    Return value needs to be a string.

* */


// Test Cases
// Function sorts the input string alphabetically
// Function returns the appropriate number of each element, depending on its place in the alphabet, i.e. a is returned once, b is returned twice

class AlphabeticalSequence {
    fun alphaSeq(inputString: String): String {
        val sortedList = inputString.lowercase().toList().sorted()
        var resultString = ""
        sortedList.forEach {
            val position = it.lowercaseChar().code - 96
            resultString += "$it".repeat(position) + ","
            
        }
        return resultString.dropLast(1)
    }

}