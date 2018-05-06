package containerWithMostWater

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    @Test
    fun maxAreaTest1() {
        val containers = intArrayOf(4,1,2,5)
        val area = Solution().maxArea(containers)
        assertEquals(12, area)
    }

    @Test
    fun maxAreaTest2() {
        val containers = intArrayOf(1,4,1,2,5)
        val area = Solution().maxArea(containers)
        assertEquals(12, area)
    }

    @Test
    fun maxAreaTest3() {
        val containers = intArrayOf(3,1,4,1,2,5)
        val area = Solution().maxArea(containers)
        assertEquals(15, area)
    }

}