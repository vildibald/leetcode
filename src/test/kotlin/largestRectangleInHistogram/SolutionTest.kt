package largestRectangleInHistogram

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun largestRectangleArea() {
        val input = intArrayOf(2, 1, 5, 6, 2, 3)
        val correct = 10
        val result = Solution().largestRectangleArea(input)
        assertEquals(correct, result)
    }

    @Test
    fun largestRectangleArea2() {
        val input = intArrayOf(2, 3, 4, 6, 2, 3)
        val correct = 15
        val result = Solution().largestRectangleArea(input)
        assertEquals(correct, result)
    }
}