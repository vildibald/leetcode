package threeSum

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun threeSum1() {
        val input = intArrayOf(-1, 0, 1, 2, -1, -4)
        val output = Solution().threeSum(input)

        assertEquals(2, output.size)
        assertTrue(intArrayOf(-1, -1, 2) contentEquals output[0].toIntArray())
        assertTrue(intArrayOf(-1, 0, 1) contentEquals output[1].toIntArray())
    }

    @Test
    fun threeSum2() {
        val input = intArrayOf(-1, 0)
        val output = Solution().threeSum(input)

        assertEquals(0, output.size)
    }
}