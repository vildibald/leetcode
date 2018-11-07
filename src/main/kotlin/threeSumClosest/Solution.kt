package threeSumClosest

import java.lang.Math.abs

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example:
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()

        var closestDiff = Int.MAX_VALUE
        var closestSum = 0
        var from = 0
        while (from < nums.size) {
            var med = from + 1
            var to = nums.size - 1

            while (med < to) {
                val sum = nums[from] + nums[med] + nums[to]
                val diff = abs(target - sum)
                if (diff < closestDiff) {
                    closestDiff = diff
                    closestSum = sum
                }
                when {
                    sum < target -> {
                        med++
                    }
                    sum > target -> {
                        to--
                    }
                    else -> {
                        med++
                        to--
                    }
                }
            }
            while (from + 1 < nums.size && nums[from + 1] == nums[from]) from++
            from++
        }
        return closestSum
    }

}