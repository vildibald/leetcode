package validAnagram

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest{
    @Test
    fun isAnagramTest1(){
        val s = "anagram"
        val t = "nagaram"
        val result = Solution().isAnagram(s, t)
        assertTrue(result)
    }

    @Test
    fun isAnagramTest2(){
        val s = "anagram"
        val t = ""
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }

    @Test
    fun isAnagramTest3(){
        val s = ""
        val t = "nagaram"
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }

    @Test
    fun isAnagramTest4(){
        val s = ""
        val t = ""
        val result = Solution().isAnagram(s, t)
        assertTrue(result)
    }

    @Test
    fun isAnagramTest5(){
        val s = "rat"
        val t = "car"
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }

    @Test
    fun isAnagramTest6(){
        val s = "anagram"
        val t = "nagarama"
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }

    @Test
    fun isAnagramTest7(){
        val s = "anagrame"
        val t = "nagaram"
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }

    @Test
    fun isAnagramTest8(){
        val s = "anagrame"
        val t = "nagaramaa"
        val result = Solution().isAnagram(s, t)
        assertFalse(result)
    }
}