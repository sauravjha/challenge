package dynamicprogramming

import java.util.*


fun isPalindrome(value: String, startIndex: Int, endIndex: Int): Boolean {
    if (endIndex < startIndex) {
        return false
    }
    (0..(endIndex - startIndex) / 2).forEach {
        if (value[startIndex + it] != value[endIndex - it]) {
            return false
        }
    }
    return true
}

fun longestPalindrome(value: String): String {
    val palindromeLongest = LinkedList<String>()
    (value.indices).map { i ->
        (i until value.length).map { j ->
            val subString = value.subSequence(i, j).toString()
            if (isPalindrome(subString, 0, subString.length - 1)) {
                if (palindromeLongest.size == 0) {
                    palindromeLongest.add(subString)
                } else {
                    if (palindromeLongest.last.length < subString.length) {
                        palindromeLongest.pop()
                        palindromeLongest.add(subString)
                    }
                }
            }
        }
    }
    return palindromeLongest.first
}


class Solution {
    fun longestPalindrome(value: String): String {
        val palindromeLongest = LinkedList<String>()
        (value.indices).map { i ->
            (i..value.length).map { j ->
                val subString = value.subSequence(i, j).toString()
                if (isPalindrome(subString, 0, subString.length - 1)) {
                    if (palindromeLongest.size == 0) {
                        palindromeLongest.add(subString)
                    } else {
                        if (palindromeLongest.last.length < subString.length) {
                            palindromeLongest.pop()
                            palindromeLongest.add(subString)
                        }
                    }
                }
            }
        }
        return palindromeLongest.first
    }

    fun isPalindrome(value: String, startIndex: Int, endIndex: Int): Boolean {
        if (endIndex < startIndex) {
            return false
        }
        (0..(endIndex - startIndex) / 2).forEach {
            if (value[startIndex + it] != value[endIndex - it]) {
                return false
            }
        }
        return true
    }
}