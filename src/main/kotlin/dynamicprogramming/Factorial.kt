package dynamicprogramming

tailrec fun factorial(n: Int, accumulater: Int = 1): Int {
    if(n == 0) {
        return accumulater
    }
    return factorial(n-1, accumulater * n)
}