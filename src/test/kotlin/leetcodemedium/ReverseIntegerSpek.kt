package leetcodemedium

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object ReverseIntegerSpek: Spek({
    describe("reverse") {
        context("when input is 123") {
            it("returns 321") {
                assertThat(reverse(123), equalTo(321))
            }
        }
        context("when input is -123") {
            it("returns -321") {
                assertThat(reverse(-123), equalTo(-321))
            }
        }
    }
})