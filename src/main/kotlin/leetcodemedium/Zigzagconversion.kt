package leetcodemedium

fun zigzagConvert(s: String, numRows: Int): String {
    if (numRows == 1) return s
    val levels = Array(numRows) { StringBuilder() }
    var level = 0
    var isGoingDown = true

    s.forEach {
        levels[level].append(it)
        if (level == (numRows - 1)) {
            isGoingDown = false
        }
        if (level == 0) {
            isGoingDown = true
        }
        if (isGoingDown) level++ else level--
    }
    return levels.reduce { acc, stringBuilder -> acc.append(stringBuilder) }.toString()
}