package leetcodemedium

import kotlin.math.min

fun maxAreaTimeLimitExceeded(height: IntArray): Int {
    var maxArea = 0
    height.forEachIndexed { startingPoint, eachHeight ->
        (startingPoint + 1 until height.size).forEach { nextHeightIndex ->
            val intreastedHeight = if (eachHeight < height[nextHeightIndex]) eachHeight else height[nextHeightIndex]
            val breath = nextHeightIndex - startingPoint
            val area = intreastedHeight * breath
            if (area > maxArea) {
                maxArea = area
            }
        }
    }

    return maxArea
}

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var startingPoint = 0
    var endPoint = height.size - 1
    while (startingPoint < endPoint) {
        maxArea = maxOf(maxArea,
            (min(height[startingPoint], height[endPoint])) * (endPoint - startingPoint))
        if (height[startingPoint] < height[endPoint]) startingPoint++ else endPoint--
    }
    return maxArea
}

