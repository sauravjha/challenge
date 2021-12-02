package datastructure

import java.util.*

val listOfOperators = listOf(
    "+", "-", "/", "*"
)

private val String.isInteger: Boolean
    get() {
        return try {
            this.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }

fun postFixCalculator(input: Array<String>): Int {
    val stack = Stack<Int>()
    input.forEach {
        when {
            it.isInteger -> stack.push(it.toInt())
            it in listOfOperators -> {
                val secondOperand = stack.pop()
                val firstOperand = stack.pop()
                stack.push(evaluate(firstOperand, secondOperand, it))
            }
            else -> throw InvalidValueException("")
        }
    }
    return stack.pop()
}

fun evaluate(firstOperand: Int, secondOperand: Int, it: String): Int {
    return when(it) {
        "+" -> firstOperand + secondOperand
        "-" -> firstOperand - secondOperand
        "/" -> firstOperand / secondOperand
        "*" -> firstOperand * secondOperand
        else -> throw InvalidValueException("")
    }
}

class InvalidValueException(s: String) : Throwable()
