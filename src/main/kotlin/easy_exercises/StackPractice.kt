package easy_exercises



/*
* BEHAVIOUR OF A STACK:
* - push: push a block onto the top of the stack
* - pop: removes the top block from the stack
* - peek: view the top block without taking any action
*
* */

class Stack {
    val stackArray = mutableListOf<Any>()

    fun peek(): Any? {
        return if (stackArray.isNotEmpty()) {
            stackArray.elementAt(stackArray.size -1)
        } else {
            null
        }
    }

    fun push(block: Any) {
        stackArray.add(block)
    }

    fun pop() {
        stackArray.removeAt(stackArray.size -1)
    }


}