package threeSum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val nums = nums.distinct().sorted()

        when {
            nums.first() > 0
                    || nums.last() < 0
                    || nums.size < 3
            -> return emptyList()
        }

//        nums.dropLast(2).forEachIndexed{i, it ->
//
//        }
        return emptyList()

    }

}