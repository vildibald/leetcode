package reverseInteger7

class Solution {
    fun reverse(x: Int): Int {
        if (x between (-9 to 9)) return x
        val isNegative = x < 0
        val resultString =
                if (isNegative) x.toString().substring(1).reversed() else x.toString().reversed()
        var leadingZerosIndex = -1
        while (resultString[leadingZerosIndex + 1] == '0') {
            leadingZerosIndex++
        }
        return try {
            val result = if (leadingZerosIndex > -1) resultString.substring(leadingZerosIndex + 1).toInt()
            else resultString.toInt()
            if (isNegative) -result else result
        } catch (nfe: NumberFormatException) {
            0
        }

    }
}

private infix fun Int.between(interval: Pair<Int, Int>): Boolean {
    if (this < interval.first) return false
    if (this > interval.second) return false
    return true
}


// Much faster solution

//internal class Solution {
//    fun reverse(x: Int): Int {
//        var x = x
//        var result: Long = 0
//        while (x != 0) {
//            result = result * 10 + x % 10
//            x = x / 10
//        }
//        return if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) 0 else result.toInt()
//
//    }
//}