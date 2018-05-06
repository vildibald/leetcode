package addTwoNumbers2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    fun listNodesOf(vararg vals: Int): ListNode? {
        if (vals.isEmpty()) {
            return null
        }
        var node: ListNode? = null
        vals.forEach {
            val previous = ListNode(it)
            previous.next = node
            node = previous
        }
        return node
    }

    infix fun ListNode.contentEquals(other: ListNode?): Boolean {
        var thisNode: ListNode? = this
        var otherNode = other
        while (thisNode != null && otherNode != null) {
            if (thisNode.`val` != otherNode.`val`) return false
            thisNode = thisNode.next
            otherNode = otherNode.next
        }
        if (thisNode == null) {
            if (otherNode != null) return false
        }
        if (otherNode == null) {
            if (thisNode != null) return false
        }
        return true
    }

    @Test
    fun addTwoNumbersTest1() {
        val l1 = listNodesOf(3, 4, 2)
        val l2 = listNodesOf(4, 6, 5)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(8, 0, 7)!! contentEquals output)
    }

    @Test
    fun addTwoNumbersTest2() {
        val l1 = listNodesOf(3, 4, 2)
        val l2 = listNodesOf(4, 6, 5, 2)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(4, 9, 9, 4)!! contentEquals output)
    }

    @Test
    fun addTwoNumbersTest3() {
        val l1 = listNodesOf(3)
        val l2 = listNodesOf(4, 6, 5, 2)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(4, 6, 5, 5)!! contentEquals output)
    }

    @Test
    fun addTwoNumbersTest4() {
        val l1 = listNodesOf(0)
        val l2 = listNodesOf(4, 6, 5, 2)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(4, 6, 5, 2)!! contentEquals output)
    }

    @Test
    fun addTwoNumbersTest5() {
        val l1 = listNodesOf(0)
        val l2 = listNodesOf(0)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(0)!! contentEquals output)
    }

    @Test
    fun addTwoNumbersTest6() {
        val l1 = listNodesOf(9)
        val l2 = listNodesOf(1, 9, 9, 9, 9, 9, 9, 9, 9, 9)
        val output = Solution().addTwoNumbers(l1, l2)
        assertTrue(listNodesOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)!! contentEquals output)
    }
}