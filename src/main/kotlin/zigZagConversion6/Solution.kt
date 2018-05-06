package zigZagConversion6

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