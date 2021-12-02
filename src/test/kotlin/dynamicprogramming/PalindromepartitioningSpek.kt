package dynamicprogramming

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object PalindromepartitioningSpek: Spek({
    describe("isPalindrome") {
        context("when the value is mom") {
            it("returns true") {
                assertThat(isPalindrome("mom", 0, 2), equalTo(true))
            }
        }
        context("when the value is dad") {
            it("returns true") {
                assertThat(isPalindrome("dad", 0, 2), equalTo(true))
            }
        }
        context("when the value is abc") {
            it("returns false") {
                assertThat(isPalindrome("abc", 0, 2), equalTo(false))
            }
        }
    }
    describe("longestPalindrome") {
        context("when the input is abcd") {
            longestPalindrome("babad")
        }
    }
})