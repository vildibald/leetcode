package zigZagConversion6

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun convertTest1() {
        val input = "PAYPALISHIRING"
        val numRows = 3
        val output = Solution().convert(input, numRows)
        assertEquals("PAHNAPLSIIGYIR", output)
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
    }

    @Test
    fun convertTest2() {
        val input = "PAYPALISHIRING"
        val numRows = 4
        val output = Solution().convert(input, numRows)
        assertEquals("PINALSIGYAHRPI", output)
//        P     I    N
//        A   L S  I G
//        Y A   H R
//        P     I
    }

    @Test
    fun convertTest3() {
        val input = "PAYPALISHIRING"
        val numRows = 5
        val output = Solution().convert(input, numRows)
        assertEquals("PHASIYIRPLIGAN", output)
//          P       H
//          A     S I
//          Y   I   R
//          P L     I G
//          A       N
    }

    @Test
    fun convertTest4() {
        val input = "P"
        val numRows = 1
        val output = Solution().convert(input, numRows)
        assertEquals("P", output)
    }

    @Test
    fun convertTest5() {
        val input = "P"
        val numRows = 2
        val output = Solution().convert(input, numRows)
        assertEquals("P", output)
    }

    @Test
    fun convertTest6() {
        val input = "P"
        val numRows = 10
        val output = Solution().convert(input, numRows)
        assertEquals("P", output)
    }

    @Test
    fun convertTest7() {
        val input = ""
        val numRows = 10
        val output = Solution().convert(input, numRows)
        assertEquals("", output)
    }

    @Test
    fun convertTest8() {
        val input = "PAZ"
        val numRows = 10
        val output = Solution().convert(input, numRows)
        assertEquals("PAZ", output)
    }

    @Test
    fun convertTest9() {
        val input = "PAZ"
        val numRows = 1
        val output = Solution().convert(input, numRows)
        assertEquals("PAZ", output)
    }

    @Test
    fun convertTest10() {
        val input = "PAZ"
        val numRows = 2
        val output = Solution().convert(input, numRows)
        assertEquals("PZA", output)
    }

}