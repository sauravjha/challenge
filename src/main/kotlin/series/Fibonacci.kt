package series

fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    var pre = 1
    var next = 1
    var temp = 0
    var total = 0
    (0 until n).map {
        println("pre $pre")
        total += pre
        temp = next
        next += pre
        pre = temp
    }
    return total
}

fun fibonacci2(n: Int): Int {
    if(n<=1) return n
    return fibonacci2(n-1) + fibonacci2(n-2)
}