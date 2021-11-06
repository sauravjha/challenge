package sample

import java.util.*


/*
    We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].

    You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.

    If you choose a job that ends at time X you will be able to start another job that starts at time X.
    Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
    Output: 120
    Explanation: The subset chosen is the first and fourth job.
    Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.

    Ref: https://leetcode.com/problems/maximum-profit-in-job-scheduling/

 */
data class Job(
    val start: Int,
    val finish: Int,
    val profit: Int
)

fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
    val jobs = (startTime.indices).map {
        Job(startTime[it], endTime[it], profit[it])
    }
    val sortedJob = jobs.sortedBy { it.start }
    return findMaximumProfit(sortedJob)
}


fun jobScheduling(startTime: Array<Int>, endTime: Array<Int>, profit: Array<Int>): Int {
    val jobs = (startTime.indices).map {
        Job(startTime[it], endTime[it], profit[it])
    }
    val sortedJob = jobs.sortedBy { it.start }
    //return findMaximumProfit(sortedJob)
    return findMaxProfit(sortedJob)

}

fun jobSchedulingWithStartAndEndTime(
    begin: Int,
    end: Int,
    startTime: Array<Int>,
    endTime: Array<Int>,
    profit: Array<Int>
): Int {
    val jobs = (startTime.indices).map {
        Job(startTime[it], endTime[it], profit[it])
    }
    val sortedJob = jobs.sortedBy { it.start }.filter { it.start >= begin && it.finish <= end }
    return findMaximumProfit(sortedJob)
}
private fun findMaximumProfit(jobs: List<Job>): Int {
    val n: Int = jobs.size
    if (n == 0) {
        return 0
    }
    val maxProfit = IntArray(n)
    for (i in 0 until n) {
        maxProfit[i] = 0
        for (j in 0 until i) {
            if (jobs[j].finish <= jobs[i].start
                && maxProfit[i] < maxProfit[j]
            ) {
                maxProfit[i] = maxProfit[j]
            }
        }
        maxProfit[i] += jobs[i].profit
    }
    //Arrays.stream(maxProfit).max().getAsInt()
    return maxProfit.maxOf { it }
}
fun findMaxProfit(jobs: List<Job>): Int {
    val n = jobs.size
    if(n == 0) {
        return 0
    }
    val maxProfit = IntArray(n)
    (0 until n).forEach { i ->
        maxProfit[i] = 0
        (0 until i).forEach { j ->
            if(jobs[j].finish <= jobs[i].start && maxProfit[i] < maxProfit[j]) {
                maxProfit[i] = maxProfit[j]
            }
        }
        maxProfit[i] += jobs[i].profit
    }
    return maxProfit.maxOf { it }
}
/*
data class Job(
    val start: Int,
    val finish: Int,
    val profit: Int
)

class Solution {
    fun jobScheduling(startTime: Array<Int>, endTime: Array<Int>, profit: Array<Int>): Int {
    val jobs = (startTime.indices).map {
        Job(startTime[it], endTime[it], profit[it])
    }
    val sortedJob = jobs.sortedBy { it.start }
    return findMaximumProfit(sortedJob)
}
    private fun findMaximumProfit(jobs: List<Job>): Int {
    val n: Int = jobs.size
    if (n == 0) {
        return 0
    }
    val maxProfit = IntArray(n)
    for (i in 0 until n) {
        maxProfit[i] = 0
        for (j in 0 until i) {
            if (jobs[j].finish <= jobs[i].start
                && maxProfit[i] < maxProfit[j]
            ) {
                maxProfit[i] = maxProfit[j]
            }
        }
        maxProfit[i] += jobs[i].profit
    }
    return Arrays.stream(maxProfit).max().getAsInt()
}
}
 */

