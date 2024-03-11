package easy_exercises


/**
 * Write a function to determine if the parentheses (), the brackets [], and the braces {}, in a string are balanced.
 *
 * For example:
 *
 *      `)(` is not balanced because `)` comes before `(`
 *
 *      `({)}` is not balanced because `)` is not balanced between `{}`
 *      and similarly the `{` is not balanced between `()`
 *
 *      `[({})]` is balanced
 *
 *      `{}([])` is balanced
 *
 *      `{()}[[{}]]` is balanced
 */

class ParenthesisDecoder {

    // Rules:
    // The second character in a parenthesis pair must be second if they are one after another.
    // () is correct, )( is incorrect
    // {} is correct }{ is incorrect
    // [] is correct ][ is incorrect
    fun areParenthesesBalanced(parenthesisString: String): Boolean {
        return when (parenthesisString) {
            "()" -> true
            "{}" -> true
            "[]" -> true
            else -> false
        }
    }

}