package integerToRoman12

class Solution {
    fun intToRoman(num: Int): String {
        val thousands = num / 1000
        val hundreds = num % 1000 / 100
        val tens = num % 1000 % 100 / 10
        val ones = num % 1000 % 100 % 10

        return RomanOrder.THOUSANDS.convert(thousands) +
                RomanOrder.HUNDREDS.convert(hundreds) +
                RomanOrder.TENS.convert(tens) +
                RomanOrder.ONES.convert(ones)
    }
}

enum class RomanOrder(
        val small: String,
        val medium: String,
        val large: String
) {
    ONES("I", "V", "X"),
    TENS("X", "L", "C"),
    HUNDREDS("C", "D", "M"),
    THOUSANDS("M", "M", "M");

    fun convert(orderCount: Int): String {
        return when (orderCount) {
            0 -> return ""
            in 1..3 -> small.repeat(orderCount)
            4 -> small + medium
            in 5..8 -> medium + small.repeat(orderCount - 5)
            9 -> small + large
            else -> throw IllegalArgumentException("Argument $orderCount is greater than 9")
        }

    }
}

