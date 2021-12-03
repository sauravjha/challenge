package leetcodemedium

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ContainerWithMostWaterSpek: Spek({
    describe("maxAreaTimeLimitExceeded"){
        context("when the input is [1,8,6,2,5,4,8,3,7]"){
            it("returns 49") {
                val maxArea = maxAreaTimeLimitExceeded(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
                assertThat(maxArea, equalTo(49))
            }
        }
    }
    describe("maxArea"){
        context("when the input is [1,8,6,2,5,4,8,3,7]"){
            it("returns 49") {
                val maxArea = maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))
                assertThat(maxArea, equalTo(49))
            }
        }
        context("when the input is [1,1]"){
            it("returns 1") {
                val maxArea = maxArea(intArrayOf(1, 1))
                assertThat(maxArea, equalTo(1))
            }
        }
    }
})