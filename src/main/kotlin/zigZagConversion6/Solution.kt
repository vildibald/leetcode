package zigZagConversion6

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 0) return s
        if (numRows == 1) return s
        if (numRows >= s.length) return s

        val resultBuilder = StringBuilder(s.length)
        val skip = numRows * 2 - 2
        resultBuilder.appendSubstring(s = s, skip = skip)
        for (i in 1 until numRows - 1) {
            resolveLine(s, resultBuilder, i, numRows)
        }
        resultBuilder.appendSubstring(s = s, from = numRows - 1, skip = skip)
        return resultBuilder.toString()
    }

    private fun resolveLine(s: String, resultBuilder: StringBuilder, begin: Int, numRows: Int) {
        val skip = numRows * 2 - 2
        val midOfset = (begin + skip) - 3 * begin
        for (i in begin until s.length step skip) {
            resultBuilder.append(s[i])
            val midIndex = i + midOfset
            if (midIndex < s.length) resultBuilder.append(s[midIndex])
        }
    }

    private fun StringBuilder.appendSubstring(s: String, from: Int = 0, to: Int = s.length,
                                              skip: Int = 0) {
        for (i in from until to step skip) {
            this.append(s[i])
        }
    }

}