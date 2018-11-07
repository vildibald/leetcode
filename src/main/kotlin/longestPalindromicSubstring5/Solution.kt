package longestPalindromicSubstring5

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: "cbbd"
 * Output: "bb"
 */
class Solution {
    fun longestPalindrome(s: String): String {
        if (s.length <= 1) return s

        var best = s[0].toString()
        for (i in 1 until s.length) {
            val candidateEven = findPalindromAt(s, i, true)
            val candidateOdd = findPalindromAt(s, i, false)

            if (candidateEven.length > best.length) {
                best = candidateEven
            }

            if (candidateOdd.length > best.length) {
                best = candidateOdd
            }
        }
        return best
    }

    private fun findPalindromAt(s: String, i: Int, startFromBetween: Boolean = false): String {
        var from = i
        var to = if (startFromBetween) i - 1 else i
        while (mayContinue(s, from, to)) {
            from--
            to++
        }
        return s.substring(from, to + 1)
    }

    private fun mayContinue(s: String, from: Int, to: Int): Boolean {
        if (from - 1 < 0) return false
        if (to + 1 >= s.length) return false
        if (s[from - 1] != s[to + 1]) return false
        return true
    }
}