package repeatedStringMatch686

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @org.junit.jupiter.api.Test
    fun repeatedStringMatch() {
        val A = "abcd"
        val B = "cdabcdab"
        val result = Solution().repeatedStringMatch(A, B)
        assertEquals(3, result)
    }
}