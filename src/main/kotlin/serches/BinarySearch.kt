package serches

fun <T: Comparable<T>> binarySearch(array: Array<T>, key: T): Int {
    return binarySearchHelper(array, key, 0, array.size -1)
}

fun <T: Comparable<T>> binarySearchHelper(array: Array<T>, key: T, start: Int, end: Int): Int {
    if (end < start) {
        return -1
    }
    val mid = start + (end - start) / 2
    val compareMidWithKey = array[mid].compareTo(key)
    return when {
        compareMidWithKey < 0 -> binarySearchHelper(array, key, mid + 1 , end)
        compareMidWithKey > 0 -> binarySearchHelper(array, key, start, mid - 1)
        else -> mid
    }
}
