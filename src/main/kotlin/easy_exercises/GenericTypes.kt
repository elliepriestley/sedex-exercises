package easy_exercises

// Practice for understanding generic types in Kotlin, as well as sub and super types.

// 1. Generic Functions
// The type parameter is a placeholder for a concrete type

fun <T> returnType(value: T) = value



// 2. Generic classes
// This is a box class with a generic type
class Box<T>(private val contents: T) {
    fun returnContents(): T {
        return contents
    }
}

// Using this, I will be able to define the contents with any type...
var stringBox = Box("string")
var intBox = Box(87)
var listOfStringsBox= Box(listOf("Spring", "Summer", "Autumn", "Winter"))
// This means that the Box type is reusable throughout my code base for different instances of the Box class

class ValueWithHistory<T>
    (private var value: T) {
    private var history: List<T> = listOf(value)

    fun setValue(value: T) {
        this.value = value
        this.history += value
    }

    fun currentValue(): T = value

    fun history(): List<T> = history
}

fun main() {
    // 1. Generic functions:
    returnType<Int>(2)
    returnType<String>("Hello")
    returnType<List<String>>(listOf("Spring", "Summer"))
    // Kotlin can infer the type of <T> in these above cases ^


    // 2. Generic classes
    val letter = ValueWithHistory<String>("A")
    // The type of letter is ValueWithHistory<String>
    letter.setValue("B")
    // letter.setValue(123) would not compile as the type is now incorrect
    val currentValueOfLetter = letter.currentValue() // This is B and type is string
    val currentHistoryOfLetter = letter.history() // This is ["A", "B"] and type is a list of strings


}





























