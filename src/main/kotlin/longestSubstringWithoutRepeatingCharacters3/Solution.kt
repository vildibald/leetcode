package longestSubstringWithoutRepeatingCharacters3

import java.lang.Integer.max

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a
 * substring, "pwke" is a subsequence and not a substring.
 */
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isBlank()) return 0
        var from = 0
        var to: Int
        var longest = 1
        val indices = HashMap<Char, Int>()
        s.forEachIndexed { i, character ->
            val maybeFrom = indices[character]
            if (maybeFrom != null) {
                from = max(from,maybeFrom + 1)
            }
            indices[character] = i
            to = i + 1
            longest = max(longest, to - from)
        }

        return longest
    }
}