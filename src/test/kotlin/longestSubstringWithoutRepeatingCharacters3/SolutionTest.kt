package longestSubstringWithoutRepeatingCharacters3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun lengthOfLongestSubstringTest1() {
        val string = "abcabcbb"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(3, result)
    }

    @Test
    fun lengthOfLongestSubstringTest2() {
        val string = "bbbbb"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(1, result)
    }

    @Test
    fun lengthOfLongestSubstringTest3() {
        val string = "pwwkew"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(3, result)
    }

    @Test
    fun lengthOfLongestSubstringTest4() {
        val string = "idemedomilana"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(8, result)
    }

    @Test
    fun lengthOfLongestSubstringTest5() {
        val string = ""
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(0, result)
    }

    @Test
    fun lengthOfLongestSubstringTest6() {
        val string = "a"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(1, result)
    }

    @Test
    fun lengthOfLongestSubstringTest7() {
        val string = "ab"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(2, result)
    }

    @Test
    fun lengthOfLongestSubstringTest8() {
        val string = "aa"
        val result = Solution().lengthOfLongestSubstring(string)
        assertEquals(1, result)
    }
}