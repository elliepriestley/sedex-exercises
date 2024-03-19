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
        return if (stackList.isNotEmpty()) {
            stackList.elementAt(stackList.size -1)
        } else {
            null
        }
    }

    fun push(block: Any) {
        stackList.add(block)
    }

    fun pop(): Any? {
        return if (stackList.isNotEmpty()) {
            val topBlock = stackList.elementAt(stackList.size -1)
            stackList.removeAt(stackList.size -1)
            topBlock
        } else {
            null
        }




    }


}