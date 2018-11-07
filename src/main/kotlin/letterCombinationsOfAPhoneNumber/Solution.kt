package letterCombinationsOfAPhoneNumber

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Note that 1 does not map to any letters.
 *
 * Example:
 * Input: "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
class Solution {
    fun letterCombinations(digits: String): List<String> {
        val result = mutableListOf<String>()
        val digitLists = digits.map { Keyboard[it]!! }
        fill(result, digitLists)
        return result
    }

    private fun fill(result: MutableList<String>, digitLists: List<List<String>>, level:
    Int = 0,
                             string: String = "") {
        if (digitLists.size == level) {
            result.add(string)
            return
        }
        for (letter in digitLists[level]) {
            val newString = string + letter
            fill(result, digitLists, level + 1, newString)
        }
    }


}

object Keyboard : Map<Char, List<String>> by mapOf(
        '2' to listOf("a", "b", "c"),
        '3' to listOf("d", "e", "f"),
        '4' to listOf("g", "h", "i"),
        '5' to listOf("j", "k", "l"),
        '6' to listOf("m", "n", "o"),
        '7' to listOf("p", "q", "r", "s"),
        '8' to listOf("t", "u", "v"),
        '9' to listOf("w", "x", "y", "z")
)

