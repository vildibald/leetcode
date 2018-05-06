package regularExpressionMatching

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun isMatchTest1() {
        val string = "aa"
        val pattern = "a"
        val output = Solution().isMatch(string, pattern)
        assertEquals(false, output)
    }

    @Test
    fun isMatchTest2() {
        val string = "aa"
        val pattern = "a*"
        val output = Solution().isMatch(string, pattern)
        assertEquals(true, output)
    }

    @Test
    fun isMatchTest3() {
        val string = "ab"
        val pattern = ".*"
        val output = Solution().isMatch(string, pattern)
        assertEquals(true, output)
    }

    @Test
    fun isMatchTest4() {
        val string = "aab"
        val pattern = "c*a*b"
        val output = Solution().isMatch(string, pattern)
        assertEquals(true, output)
    }

    @Test
    fun isMatchTest5() {
        val string = "mississipi"
        val pattern = "mis*is*p*."
        val output = Solution().isMatch(string, pattern)
        assertEquals(false, output)
    }

    @Test
    fun isMatchTest6() {
        val string = "mississipi"
        val pattern = "mis*is*ip*."
        val output = Solution().isMatch(string, pattern)
        assertEquals(true, output)
    }
}