import dynamicprogramming.factorial
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import series.fibonacci
import series.fibonacci2
import kotlin.test.assertEquals

object FectorialSpek: Spek({
    describe("fibonacci") {
        context("when the input is 5") {
            assertEquals(12, fibonacci(5))
        }
    }

    describe("fibonacci") {
        context("when the input is 5") {
            // 1+1+ 2+ 3+ 5 = 12
            assertEquals(12, fibonacci2(5))
        }
    }
})