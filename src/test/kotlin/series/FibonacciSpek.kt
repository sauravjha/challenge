package series

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

object FibonacciSpek: Spek({
    describe("fibonacci") {
        describe("fibonacci1") {
            context("when the input is 5") {
                // 1+1+ 2+ 3+ 5 = 12
                assertEquals(12, fibonacci(5))
            }
        }
//        describe("fibonacci2") {
//            context("when the input is 5") {
//                assertEquals(12, fibonacci2(5))
//            }
//        }
    }
})