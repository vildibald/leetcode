package integerToRoman12

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun intToRomanTest1() {
        val integer = 3
        val roman = Solution().intToRoman(integer)
        assertEquals("III", roman)
    }

    @Test
    fun intToRomanTest2() {
        val integer = 5
        val roman = Solution().intToRoman(integer)
        assertEquals("V", roman)
    }

    @Test
    fun intToRomanTest3() {
        val integer = 4
        val roman = Solution().intToRoman(integer)
        assertEquals("IV", roman)
    }

    @Test
    fun intToRomanTest4() {
        val integer = 9
        val roman = Solution().intToRoman(integer)
        assertEquals("IX", roman)
    }

    @Test
    fun intToRomanTest5() {
        val integer = 58
        val roman = Solution().intToRoman(integer)
        assertEquals("LVIII", roman)
    }

    @Test
    fun intToRomanTest6() {
        val integer = 1994
        val roman = Solution().intToRoman(integer)
        assertEquals("MCMXCIV", roman)
    }

    @Test
    fun intToRomanTest7() {
        val integer = 2007
        val roman = Solution().intToRoman(integer)
        assertEquals("MMVII", roman)
    }

    @Test
    fun intToRomanTest8() {
        val integer = 400
        val roman = Solution().intToRoman(integer)
        assertEquals("CD", roman)
    }
}