package twoSum1

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
        val table = HashMap<Int, Int>()
        nums.forEachIndexed { i, item ->
            val diff = target - item
            if(diff in table)
               return intArrayOf(table[diff]!!, i)
            table[item] = i
        }
        return intArrayOf()
    }

}