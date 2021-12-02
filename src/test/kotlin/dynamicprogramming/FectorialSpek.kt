import dynamicprogramming.factorial
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import series.fibonacci

object FectorialSpek: Spek({
    describe("factorial") {
        context("when the input is 5") {
            (0..5).forEach {
                println(fibonacci(it))
            }
        }
    }
})