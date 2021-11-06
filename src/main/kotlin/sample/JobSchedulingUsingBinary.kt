package sample

import kotlin.math.max

// ref: https://www.cnblogs.com/lz87/p/7288799.html

fun jobScheduling2(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
    val n = startTime.size -1
    val allJobs = (startTime.indices).map {
        Job(startTime[it], endTime[it], profit[it])
    }
    val sortedJobs = allJobs.sortedBy { it.finish }

    val jobProfits = IntArray(startTime.size)
    jobProfits[0] = sortedJobs[0].profit

    (1 until startTime.size).forEach {
        var currentProfit: Int = sortedJobs[it].profit
        val lastNonOverlapIndex = binarySearch(sortedJobs,0, it-1, sortedJobs[it].start)
        currentProfit += if (lastNonOverlapIndex > 0) jobProfits[lastNonOverlapIndex] else 0
        jobProfits[it] = max(currentProfit, jobProfits[it - 1])
    }
    return jobProfits[n]
}


fun  binarySearch(
    jobs: List<Job>,
    start: Int,
    end: Int,
    nextStart: Int): Int {
    var s = start
    var e = end
    while(s < e - 1) {
        var mid = s + (e-1) / 2
        if(jobs[mid].finish <= nextStart) {
            s = mid + 1
        } else {
            e = mid - 1
        }
    }
    return if(jobs[e].finish <= nextStart) {
        e
    } else if (jobs[s].start <= nextStart) {
        s
    } else {
        -1
    }
}
