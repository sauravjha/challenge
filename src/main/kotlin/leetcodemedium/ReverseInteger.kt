package leetcodemedium
/*
Time Submitted
Status
Runtime
Memory
Language
17:48	Accepted	132 ms	33.4 MB	kotlin
 */
fun reverse(x: Int): Int {
    var number = x
    var reversedNumber = 0
    while (kotlin.math.abs(number) >0) {
        val lastDigit = number % 10
        number /= 10
        if (reversedNumber > Integer.MAX_VALUE/10 || (reversedNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
        if (reversedNumber < Integer.MIN_VALUE/10 || (reversedNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
        reversedNumber = reversedNumber * 10 + lastDigit

    }
    return reversedNumber
}

/*
Time Submitted
Status
Runtime
Memory
Language
12/03/2021 18:02	Accepted	152 ms	35.4 MB	kotlin
 */

fun reverseByConvertingToString(x: Int): Int {
    var number = kotlin.math.abs(x).toString().reversed()
    return try {
        val reversed = number.toInt()
        if (x < 0 ) reversed * -1 else reversed
    } catch (e: Exception) {
        0
    }
}