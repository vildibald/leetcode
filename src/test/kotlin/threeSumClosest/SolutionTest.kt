package threeSumClosest

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun threeSum1() {
        val input = intArrayOf(-1, 2, 1, -4)
        val output = Solution().threeSumClosest(input, 1)

        assertEquals(2, output)
    }

    @Test
    fun threeSum2() {
        val input = intArrayOf(-1, 2, -4, 1)
        val output = Solution().threeSumClosest(input, 1)

        assertEquals(2, output)
    }


}