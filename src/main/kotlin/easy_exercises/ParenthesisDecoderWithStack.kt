package easy_exercises

import java.util.Stack

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
 *      `{)}([[{}]]` is balanced
 */

class ParenthesisDecoderWithStack {

    // loop through the string.
    // for each iteration
    // if the char is an opening parentheses ( it goes into the holdingStack
    // if the char is a closing parentheses ) : check whether the stack is empty. If so, return false as stack is not balanced.
    // if the stack is empty, that () is resolved and char can be popped
    // check if stack is empty at end of iteration

    fun isStringBalanced(inputString: String): Boolean {
        val holdingStack: Stack<Char> = Stack()
        val parenthesesPairs: Map<Char, Char> = mapOf('(' to ')', '{' to '}', '[' to ']')

        inputString.forEach { char ->
            when (char) {
                in parenthesesPairs.keys -> holdingStack.push(char)
                in parenthesesPairs.values -> {
                    if (holdingStack.isEmpty()) {
                        return false
                    }
                    val matchingOpeningParenthesis = parenthesesPairs.entries.firstOrNull { it.value == char }?.key
                    if (holdingStack.peek() == matchingOpeningParenthesis) {
                        holdingStack.pop()
                    } else {
                        return false
                    }
                }
            }
        }
        return holdingStack.isEmpty()
    }
}