import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.describe
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object AddTwoNumberSpek: Spek({
    describe("add two numbers") {
        context("when the input has same number") {
            val l13 = ListNode(3)
            val l12 = ListNode(4)
            l12.next = l13
            val l11 = ListNode(2)
            l11.next = l12

            val l23 = ListNode(4)
            val l22 = ListNode(6)
            l22.next = l23
            val l21 = ListNode(5)
            l21.next = l22

            val addTwoNumber3 = addTwoNumber(l11, l21)
            it("first value is 7") {
                assertThat(addTwoNumber3?.`val`, equalTo(7))
            }
            it("second value is 0") {
                assertThat(addTwoNumber3?.next?.`val`, equalTo(0))
            }
            it("third value is 8") {
                assertThat(addTwoNumber3?.next?.next?.`val`, equalTo(8))
            }
        }
    }
})