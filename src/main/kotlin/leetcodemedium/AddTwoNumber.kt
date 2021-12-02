import java.util.*
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

data class ListNodeWithRemender(val listNode: ListNode, val reminder: Int)

fun addTwoNumber(l1: ListNode?, l2: ListNode?): ListNode? {
    val allNode = LinkedList<ListNodeWithRemender>()
    var currentNode = l1
    var currentNode2 = l2
    while (currentNode?.`val` != null || currentNode2?.`val` != null) {
        val totalValue = (currentNode?.`val` ?: 0) +
                (currentNode2?.`val` ?: 0) + if (allNode.size > 0) allNode.last.reminder else 0

        val newNode = ListNode(totalValue % 10)
        if (allNode.size > 0) allNode.last.listNode.next = newNode
        allNode.add(ListNodeWithRemender(newNode, totalValue / 10))

        currentNode = currentNode?.next
        currentNode2 = currentNode2?.next
    }
    if (allNode.last.reminder > 0) {
        val finalNode = ListNode(allNode.last.reminder)
        allNode.last.listNode.next = finalNode
        allNode.add(ListNodeWithRemender(finalNode, 0))
    }
    return allNode.first.listNode
}