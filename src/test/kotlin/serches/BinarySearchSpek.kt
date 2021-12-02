package serches

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object BinarySearchSpek: Spek({
    describe("binarySearch") {
        context("when the array is [1,2,3,4,5,6,7] and key is 2") {
            it("returns 1") {
             assertThat(binarySearch(arrayOf(1,2,3,4,5,6,7), 2), equalTo(1))
            }
        }
    }

})