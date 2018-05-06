package longestPalindromicSubstring5

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun longestPalindromeTest1() {
        val input = "babad"
        val output = Solution().longestPalindrome(input)
        assertEquals("bab", output)
    }

    @Test
    fun longestPalindromeTest2() {
        val input = "cbbd"
        val output = Solution().longestPalindrome(input)
        assertEquals("bb", output)
    }

    @Test
    fun longestPalindromeTest3() {
        val input = ""
        val output = Solution().longestPalindrome(input)
        assertEquals("", output)
    }

    @Test
    fun longestPalindromeTest4() {
        val input = "a"
        val output = Solution().longestPalindrome(input)
        assertEquals("a", output)
    }

    @Test
    fun longestPalindromeTest5() {
        val input = "aaaa"
        val output = Solution().longestPalindrome(input)
        assertEquals("aaaa", output)
    }
}