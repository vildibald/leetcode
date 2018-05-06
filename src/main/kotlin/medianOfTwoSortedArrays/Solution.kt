package medianOfTwoSortedArrays

import kotlin.math.max
import kotlin.math.min

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
class Solution {

    /**
     * NOT MINE SOLUTION
     */
    fun findMedianSortedArrays(A: IntArray, B: IntArray): Double {
        val left: IntArray
        val right: IntArray
        if (A.size <= B.size) {
            left = A
            right = B
        } else {
            left = B
            right = A
        }
        val m = left.size
        val n = right.size

        var iMin = 0
        var iMax = m
        val half = (m + n + 1) / 2
        while (iMin <= iMax) {
            val i = (iMin + iMax) / 2
            val j = half - i
            if (i < iMax && right[j - 1] > left[i]) {
                iMin++
            } else if (i > iMin && left[i - 1] > right[j]) {
                iMax--
            } else {
                val leftMax = when {
                    i == 0 -> right[j - 1]
                    j == 0 -> left[i - 1]
                    else -> max(left[i - 1], right[j - 1])
                }
                if ((m + 2) % 2 == 1) return leftMax.toDouble()

                val rightMin = when {
                    i == 0 -> right[j]
                    j == n -> left[i]
                    else -> min(right[j], left[i])
                }
                return (leftMax + rightMin) / 2.0
            }
        }
        return 0.0
    }

//    fun findMedianSortedArrays(left: IntArray, right: IntArray): Double {
//        var fromLeft = 0
//        var toLeft = left.size
//        var fromRight = 0
//        var toRight = right.size
//
//        while (fromLeft <= toLeft + 1 && fromRight <= toRight + 1) {
//            val (medianLeftIndex, medianLeft) = findMedianSortedArray(left, fromLeft, toLeft)
//            val (medianRightIndex, medianRight) = findMedianSortedArray(right, fromRight, toRight)
//
//            if (medianLeft < medianRight) {
//                fromLeft = medianLeftIndex
//                toRight = medianRightIndex
//            } else {
//                toLeft = medianLeftIndex
//                fromRight = medianRightIndex
//            }
//
//        }
//
//        return (left[fromLeft].toDouble() + right[fromRight].toDouble()) / 2
//    }

//    private fun findMedianSortedArrays(nums1: IntArray, fromTo1: Pair<Int, Int>,
//                                       nums2: IntArray, fromTo2: Pair<Int, Int>): Double {
//        if (fromTo1.first == fromTo1.second + 1 && fromTo2.first == fromTo2.second + 1) {
//            return (nums1[fromTo1.first].toDouble() + nums2[fromTo2.first].toDouble()) / 2
//        }
//        val (median1Index, median1) = findMedianSortedArray(nums1, fromTo1.first, fromTo1.second)
//        val (median2Index, median2) = findMedianSortedArray(nums2, fromTo2.first, fromTo2.second)
//
//        if (median1 <= median2) {
//            findMedianSortedArrays(
//                    nums1, median1Index to fromTo1.second,
//                    nums2, fromTo2.first to median2Index)
//        } else {
//            findMedianSortedArrays(
//                    nums2, median2Index to fromTo1.second,
//                    nums1, fromTo2.first to fromTo2.first)
//        }
//
//
//    }


}

fun findMedianSortedArray(nums: IntArray, fromIndex: Int = 0, toIndex: Int): Pair<Int, Double> {
    val size = toIndex - fromIndex
    if (size == 0) return fromIndex to nums[fromIndex - 1].toDouble()
    if (size == 1) return fromIndex + 1 to nums[fromIndex].toDouble()

    val halfIndex = fromIndex + size / 2
    if (size % 2 == 0) return halfIndex to (nums[halfIndex - 1] + nums[halfIndex]) / 2.0
    return halfIndex to nums[halfIndex].toDouble()
}

fun findMedianSortedArray(nums: IntArray, fromIndex: Int = 0): Pair<Int, Double> {
    val toIndex = nums.size
    return findMedianSortedArray(nums, fromIndex, toIndex)
}

/*
1 2			1.5
1 3 4 5 6		4
1 1 2 3 4 5 6		3


1 3 4 5 6			4
1 1 2 3 4 5 6			3
1 1 1 2 3 3 4 4 5 5 6 6		3.5


1 3 4 5			3.5
5 6 7 8 9		7
1 3 4 5 5 6 7 8 9	5
 */