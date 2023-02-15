package MergeNodesinBetweenZeros;

import BinaryTreeInorderTraversal.TreeNode;
import ReverseLinkedList.ListNode;

public class Solution {

    public ListNode mergeNodes(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode node = null;
        ListNode current = null;
        while (head.next != null) {
            int count = 0;
            head = head.next;
            while (head.val != 0) {
                count += head.val;
                head = head.next;
            }
            if (node == null){
            node = new ListNode(count);
            current = node.next;
            }
            else {
                current = new ListNode(count);
                current = current.next;
                node.next = current;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        Solution solution = new Solution();
        ListNode result = solution.mergeNodes(head);

        System.out.println(result.val);
    }
}
