package containerWithMostWater

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