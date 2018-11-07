package threeSum

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * Note:
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 *      [-1,  0, 1],
 *      [-1, -1, 2]
 * ]
 */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        when {
            nums.isEmpty()
                    || nums.first() > 0
                    || nums.last() < 0
                    || nums.size < 3
            -> return emptyList()
        }

        val result = mutableListOf<List<Int>>()
        var i = 0
        while (i < nums.size) {
            val target = -nums[i]
            var from = i + 1
            var to = nums.size - 1

            while (from < to) {
                val sum = nums[from] + nums[to]
                when {
                    sum < target -> {
                        from++
                    }
                    sum > target -> {
                        to--
                    }
                    else -> {
                        val solution = listOf(nums[i], nums[from], nums[to])
                        result += solution
                        while (from < to && solution[1] == nums[from]) from++
                        while (from < to && solution[2] == nums[to]) to--
                    }
                }
            }
            while (i + 1 < nums.size && nums[i + 1] == nums[i]) i++
            i++
        }
        return result
    }

}