package leetcodemedium

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import lengthOfLongestSubstring
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object LengthOfLongestSubstringSpek: Spek({
    describe("lengthOfLongestSubString") {
        context("when the input is \"abcabcbb\"") {
            it("returns 3") {
                assertThat(lengthOfLongestSubstring("abcabcbb"), equalTo(3))
            }
        }
    }
})