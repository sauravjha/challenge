package datastructure

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object PostFixCalculatorSpek: Spek({
    describe("postFixCalculator") {
        val input = arrayOf("5", "6", "2", "+", "*", "12", "4", "/", "-")
        context("when the input is") {
            it("returns 37") {
                assertThat(postFixCalculator(input), equalTo(37))
            }
        }
    }
})