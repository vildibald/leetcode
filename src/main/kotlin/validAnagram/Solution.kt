package validAnagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charCounts = mutableMapOf<Char, Int>()
        s.forEach { char ->
            val count = 1 + (charCounts[char] ?: 0)
            charCounts[char] = count
        }
        t.forEach { char ->
            val count = charCounts[char]
            if (null == count || count < 1) return false
            charCounts[char] = count - 1
        }
        return true
    }
}