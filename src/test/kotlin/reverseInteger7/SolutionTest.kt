package reverseInteger7

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun reverseTest1() {
        val input = 123
        val output = Solution().reverse(input)
        assertEquals(321, output)
    }

    @Test
    fun reverseTest2() {
        val input = -123
        val output = Solution().reverse(input)
        assertEquals(-321, output)
    }

    @Test
    fun reverseTest3() {
        val input = 120
        val output = Solution().reverse(input)
        assertEquals(21, output)
    }

    @Test
    fun reverseTest4() {
        val input = -120
        val output = Solution().reverse(input)
        assertEquals(-21, output)
    }

    @Test
    fun reverseTest5() {
        val input = 1123456789
        val output = Solution().reverse(input)
        assertEquals(0, output)
    }

    @Test
    fun reverseTest6() {
        val input = -1123456789
        val output = Solution().reverse(input)
        assertEquals(0, output)
    }
}