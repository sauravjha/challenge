package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
/*
    Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
    Output: 120
    Explanation: The subset chosen is the first and fourth job.
    Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
 */

object JobSchedulingSpek: Spek({
    describe("jobScheduling") {
        context("when the Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]") {
            it("returns 120") {
                val startTime = arrayOf(1,2,3,3)
                val endTime = arrayOf(3,4,5,6)
                val profit = arrayOf(50,10,40,70)
                assertThat(jobScheduling(startTime, endTime, profit), equalTo(120))
            }
        }
    }
    describe("jobSchedulingWithStartAndEndTime") {
        context("when the Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]") {
            it("returns 120") {
                val startTime = arrayOf(1,2,3,3)
                val endTime = arrayOf(3,4,5,6)
                val profit = arrayOf(50,10,40,70)
                assertThat(jobSchedulingWithStartAndEndTime(1, 6, startTime, endTime, profit), equalTo(120))
            }
        }
    }
})