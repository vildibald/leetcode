package addTwoNumbers2

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order and each of their nodes contain a single digit. Add the two numbers
 * and return it as a linked list. You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class Solution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var left = l1
        var right = l2
        val resultHead = ListNode(0)
        var current: ListNode? = resultHead
        var carry = 0
        while (left != null || right != null) {
            val leftDigit = left?.`val` ?: 0
            val rightDigit = right?.`val` ?: 0
            val sum = carry + leftDigit + rightDigit
            carry = sum / 10
            current?.next = ListNode(sum % 10)
            current = current?.next
            left = left?.next
            right = right?.next
        }
        if (carry > 0) {
            current?.next = ListNode(carry)
        }
        return resultHead.next
    }
}