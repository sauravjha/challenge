package leetcodemedium

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object LongestPalindromicSubstringSpek: Spek({
    describe("LongestPalindromicSubstring") {
        context("when the input is babad") {
            it("returns bab") {
                assertThat(longestPalindromeBruteForce("babad"), equalTo("bab"))
            }
        }

        context("when the input is \"cbbd\"") {
            it("returns bb") {
                assertThat(longestPalindromeDynamicProgramming("cbbd"), equalTo("bb"))
            }
        }
    }
})