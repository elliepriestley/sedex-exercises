package easy_exercises



/*
* BEHAVIOUR OF A STACK:
* - push: push a block onto the top of the stack
* - pop: removes the top block from the stack
* - peek: view the top block without taking any action
*
* */

class Stack {
    private val stackList = mutableListOf<Any>()

    fun peek(): Any? {
        return stackList.lastOrNull()
    }

    fun push(block: Any) {
        stackList.add(block)
    }

    fun pop(): Any? {
        return stackList.removeLastOrNull()
    }

}