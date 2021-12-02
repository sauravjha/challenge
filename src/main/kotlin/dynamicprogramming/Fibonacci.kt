package dynamicprogramming

fun fibonacci(n: Int) : Int = fibonacci(n, 0, 1)

tailrec fun fibonacci(n: Int, pre: Int, next: Int): Int {
    return when(n) {
        0 -> pre
        1 -> next
        else -> fibonacci(n-1, next, pre+next)
    }
}