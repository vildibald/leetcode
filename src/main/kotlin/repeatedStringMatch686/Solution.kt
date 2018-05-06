package repeatedStringMatch686

import java.util.concurrent.ConcurrentHashMap

/**
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B
 * is a substring of it. If no such solution, return -1. For example, with A = "abcd" and B = "cdabcdab".
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B
 * is not a substring of A repeated two times ("abcdabcd").
 * Note: The length of A and B will be between 1 and 10000.
 */
class Solution {
    fun repeatedStringMatch(A: String, B: String): Int {
        val As = StringBuilder(A)
        var count = 1
        while(As.length<B.length){
            As.append(A)
            count++
        }
        if(As.contains(B)){
            return count
        }
        if(As.append(A).contains(B)){
            return count+1
        }
        return -1

    }
}