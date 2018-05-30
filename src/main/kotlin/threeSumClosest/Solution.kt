package threeSumClosest

import java.lang.Math.abs

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