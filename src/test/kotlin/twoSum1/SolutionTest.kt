package twoSum1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun twoSumTest1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf(0, 1) contentEquals result)
    }

    @Test
    fun twoSumTest2() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 18
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf(1, 2) contentEquals result)
    }

    @Test
    fun twoSumTest3() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 22
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf(1, 3) contentEquals result)
    }

    @Test
    fun twoSumTest4() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 19
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf() contentEquals result)
    }

    @Test
    fun twoSumTest5() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf(1, 2) contentEquals result)
    }

    @Test
    fun twoSumTest6() {
        val nums = intArrayOf(-1, -2, -3, -4, -5)
        val target = -8
        val result = Solution().twoSum(nums, target)
        assertTrue(intArrayOf(2, 4) contentEquals result)
    }
}