package medianOfTwoSortedArrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionKtTest {

    @Test
    fun getMedianSortedTest1() {
        val array = intArrayOf(4)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(0, index)
        assertEquals(4.0, median)
    }

    @Test
    fun getMedianSortedTest2() {
        val array = intArrayOf(2, 4)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(1, index)
        assertEquals(3.0, median)
    }

    @Test
    fun getMedianSortedTest3() {
        val array = intArrayOf(1, 2, 4)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(1, index)
        assertEquals(2.0, median)
    }

    @Test
    fun getMedianSortedTest4() {
        val array = intArrayOf(1, 2, 4, 8)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(2, index)
        assertEquals(3.0, median)
    }

    @Test
    fun getMedianSortedTest5() {
        val array = intArrayOf(-2, -1, 4, 8)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(2, index)
        assertEquals(1.5, median)
    }

    @Test
    fun getMedianSortedTest6() {
        val array = intArrayOf(-2, -1, -4, 8, 9)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(2, index)
        assertEquals(-4.0, median)
    }

    @Test
    fun getMedianSortedTest7() {
        val array = intArrayOf(-2, -1, -4, 8, 9, 11)
        val (index, median) = findMedianSortedArray(array)
        assertEquals(3, index)
        assertEquals(2.0, median)
    }

    @Test
    fun getMedianSortedTest8() {
        val array = intArrayOf(-2, -1, -4, 8, 9, 11)
        val (index, median) = findMedianSortedArray(array, 3)
        assertEquals(4, index)
        assertEquals(9.0, median)
    }

    @Test
    fun getMedianSortedTest9() {
        val array = intArrayOf(-2, -1, -4, 8, 9, 11)
        val (index, median) = findMedianSortedArray(array, 2, 4)
        assertEquals(3, index)
        assertEquals(2.0, median)
    }

    @Test
    fun findMedianSortedArraysTest1(){
        val left = intArrayOf(1, 3)
        val right = intArrayOf(2)
        val median = Solution().findMedianSortedArrays(left, right)
        assertEquals(2.0, median)
    }

    @Test
    fun findMedianSortedArraysTest2(){
        val left = intArrayOf(1, 2)
        val right = intArrayOf(3, 4)
        val median = Solution().findMedianSortedArrays(left, right)
        assertEquals(2.5, median)
    }

    @Test
    fun findMedianSortedArraysTest3(){
        val left = intArrayOf(1, 2)
        val right = intArrayOf(1, 3, 4, 5, 6)
        val median = Solution().findMedianSortedArrays(left, right)
        assertEquals(3.0, median)
    }

    @Test
    fun findMedianSortedArraysTest4(){
        val left = intArrayOf(1, 3, 4, 5, 6)
        val right = intArrayOf(1, 1, 2, 3, 4, 5, 6)
        val median = Solution().findMedianSortedArrays(left, right)
        assertEquals(3.0, median)
    }
}