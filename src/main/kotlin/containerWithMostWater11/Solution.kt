package containerWithMostWater11

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
class Solution {
    fun maxArea(containers: IntArray): Int {
        var max = Int.MIN_VALUE
        var left = 0
        var right = containers.size - 1

        while (left != right) {
            val width = right - left
            val height: Int
            if (containers[left] < containers[right]) {
                height = containers[left]
                left++
            } else {
                height = containers[right]
                right--
            }
            val candidate = height * width
            max = if (candidate > max) candidate else max
        }
        return max
    }
}