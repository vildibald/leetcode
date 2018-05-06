package twoSum1

import java.lang.Math.abs

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target. You may assume that each input would have exactly one solution, and you may not use
 * the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result: IntArray
        for (i in 0 until nums.size - 1) {
            result = checkFrom(i, nums, target)
            if (result.isNotEmpty()) {
                return result
            }
        }
        return intArrayOf()
    }

    private fun checkFrom(fromIndex: Int, nums: IntArray, target: Int): IntArray {
        val candidate = target - nums[fromIndex]
        val indexOfCandidate = nums.indexOfFrom(fromIndex + 1, candidate)
        if (indexOfCandidate != -1) {
            return intArrayOf(fromIndex, indexOfCandidate)
        }
        return intArrayOf()
    }

    private fun IntArray.indexOfFrom(fromIndex: Int, element: Int): Int {
        for (i in fromIndex until this.size) {
            if (element == this[i]) {
                return i
            }
        }
        return -1
    }
}