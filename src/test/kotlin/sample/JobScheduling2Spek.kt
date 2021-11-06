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

object JobScheduling2Spek: Spek({
    describe("jobScheduling2") {
//        context("when the Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]") {
//            it("returns 120") {
//                val startTime = intArrayOf(1,2,3,3)
//                val endTime = intArrayOf(3,4,5,6)
//                val profit = intArrayOf(50,10,40,70)
//                assertThat(jobScheduling2(startTime, endTime, profit), equalTo(120))
//            }
//        }
        context("when the Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]") {
            it("returns 120") {
                val startTime = intArrayOf(1,2,3,4,6)
                val endTime = intArrayOf(3,5,10,6,9)
                val profit = intArrayOf(20,20,100,70,60)
                assertThat(jobScheduling2(startTime, endTime, profit), equalTo(120))
            }
        }
    }
    /*
    [1,2,3,4,6]
[3,5,10,6,9]
[20,20,100,70,60]
     */


})