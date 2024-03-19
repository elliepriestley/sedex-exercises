package easy_exercises

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class StackPracticeTest {

    @Test
    fun `When push is called on an empty stack, that block is added to the stack`() {
        val stack = Stack()
        assertEquals(null, stack.peek())
        stack.push(1)
        assertEquals(1, stack.peek())
    }

    @Test
    fun `Push always adds the block to the top of the stack`() {
        val stack = Stack()
        stack.push(1)
        assertTrue(stack.peek() == 1)
        stack.push(2)
        assertTrue(stack.peek() == 2)
        stack.push(3)
        stack.push(4)
        stack.push(5)
        assertTrue(stack.peek() == 5)
    }

    @Test
    fun `Peek always returns the block at the top of the stack`() {
        val stack = Stack()
        stack.push("A")
        assertEquals("A", stack.peek())
        stack.push("B")
        assertEquals("B", stack.peek())
        stack.push(1)
        assertEquals(1, stack.peek())


    }

    @Test
    fun `When peek is called on an empty stack, it returns null`() {
        val stack = Stack()
        assertEquals(null, stack.peek())
    }

    @Test
    fun `Pop removes the block at the top of the stack`() {
        val stack = Stack()
        stack.push("a")
        stack.push("b")
        stack.push("c")
        stack.pop()
        assertEquals("b", stack.peek())
        stack.pop()
        assertEquals("a", stack.peek())
        stack.pop()
        assertEquals(null, stack.peek())
    }

    @Test
    fun `Pop returns the block at the top of the stack`() {
        val stack = Stack()
        stack.push("alfa")
        assertEquals("alfa", stack.pop())
        stack.push("bravo")
        stack.push("charlie")
        stack.push("delta")
        stack.push("echo")
        assertEquals("echo", stack.pop())
        assertEquals("delta", stack.pop())
        assertEquals("charlie", stack.pop())
        assertEquals("bravo", stack.pop())
        assertEquals(null, stack.pop())
    }

}