package letterCombinationsOfAPhoneNumber

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun letterCombinationsTest1() {
        val input = "23"
        val output = Solution().letterCombinations(input).toTypedArray()
        assertTrue(
                arrayOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
                        contentEquals output
        )
    }

    @Test
    fun letterCombinationsTest2() {
        val input = "2"
        val output = Solution().letterCombinations(input).toTypedArray()
        assertTrue(
                arrayOf("a", "b", "c")
                        contentEquals output
        )
    }
}