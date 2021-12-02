fun lengthOfLongestSubstring(s: String): Int {
    val map: HashMap<Char, Int> = hashMapOf()
    var max = 0
    var lastReapeat = -1
    s.forEachIndexed { index, c ->
        val lastOccurrence = map[c]
        if (lastOccurrence != null) {
            lastReapeat = maxOf(lastReapeat, lastOccurrence)
        }
        max = maxOf(max, index - lastReapeat)
        map[c] = index
    }
    return max
}