package leetcodemedium

import java.util.*

data class SubString(val value: CharSequence, val size:Int )
fun longestPalindromeBruteForce(s: String): String {

    val allSubString = s.mapIndexed { index, _ ->
        (0..index).map {
            val subSequence = s.subSequence(it, index + 1)

            SubString(
                subSequence,
                subSequence.length
            )
        }
    }.flatten()
    val sortedBy = allSubString.sortedByDescending { it.size }
    sortedBy.forEach {
        if (it.value.toString() == it.value.reversed().toString()) {
            return it.value.toString()
        }
    }
    return ""
}

fun isPalindrome(value: String, startIndex: Int, endIndex: Int): Boolean {
    if (endIndex<startIndex) {
        return false
    }
    (0..(endIndex-startIndex)/2).forEach {
        if(value[startIndex+it] != value[endIndex-it]) {
            return false
        }
    }
    return true
}
/*
    In previous solution the memory limit was Exceeded
    This solution is accepted by the
 */

fun longestPalindrome(value: String): String {
    val palindromeLongest = LinkedList<String>()
    (value.indices).map { i ->
        (i until value.length).map { j ->
            val subString = value.subSequence(i, j).toString()
            if(isPalindrome(subString, 0, subString.length-1)) {
                if (palindromeLongest.size == 0) {
                    palindromeLongest.add(subString)
                } else {
                    if(palindromeLongest.last.length < subString.length) {
                        palindromeLongest.pop()
                        palindromeLongest.add(subString)
                    }
                }
            }
        }
    }
    return palindromeLongest.first
}


/*
https://leetcode.com/problems/longest-palindromic-substring/discuss/308634/top-down-dynamic-programming-solution-in-kotlin
 */
fun longestPalindromeDynamicProgramming(s: String): String {
    return if (s.length <= 1) s
    else longestPalindromeDp(s, 0, s.length - 1, Array(s.length) {
        Array<String?>(s.length) {
            null
        }
    })
}

private fun longestPalindromeDp(s: String, i: Int, j: Int, map: Array<Array<String?>>): String {
    return map[i][j] ?: run {
        map[i][j] = when {
            i > j -> ""
            i == j -> s[i].toString()
            else -> {
                if ((s[i] == s[j]) && longestPalindromeDp(s, i + 1, j - 1, map).length == j - 1 - i) {
                    s.substring(i, j + 1)
                } else {
                    val s1 = longestPalindromeDp(s, i + 1, j, map)
                    val s2 = longestPalindromeDp(s, i, j - 1, map)
                    if (s1.length > s2.length) s1 else s2
                }
            }
        }
        return map[i][j]!!
    }
}

