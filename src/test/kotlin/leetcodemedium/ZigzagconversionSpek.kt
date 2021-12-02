package leetcodemedium

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ZigzagconversionSpek: Spek({
    describe("zigzagConvert") {
        context("input string is \"PAYPALISHIRING\" and number of rows is 3") {
            it("returns PAHNAPLSIIGYIR") {
                assertThat(zigzagConvert("PAYPALISHIRING", 3), equalTo("PAHNAPLSIIGYIR"))
            }
        }
    }
})