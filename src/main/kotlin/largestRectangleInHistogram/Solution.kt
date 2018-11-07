package largestRectangleInHistogram

import java.lang.Integer.max
import java.util.*

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
//        if (heights.isEmpty()) return 0
//        if (heights.size == 1) return heights[0]
//
//        val stack = Stack<Int>()
//        stack.push(heights[0])
//        var max = heights[0]
//        var i = 1
//        while (i < heights.size || stack.isNotEmpty()) {
//            if (heights[i] > heights[i - 1]) {
//                stack.push(i)
//                max = max(max, heights[i])
//            } else {
//
//                max = max(max, processColumn(heights, stack, i))
//            }
//            ++i
//        }
//        return max
        TODO()
    }

    private fun processColumn(heights: IntArray, stack: Stack<Int>, column: Int): Int {
        var max = heights[column]
        var i = column
        while (stack.isNotEmpty() && heights[stack.peek()] >= column) {
            stack.pop()
            max = heights[column] * i
            --i
        }
        return max
    }


}