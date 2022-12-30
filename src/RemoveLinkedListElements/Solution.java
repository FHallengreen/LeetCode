package RemoveLinkedListElements;

import ReverseLinkedList.ListNode;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        } else if (head.val == val) {
            return removeElements(head.next, val);
        } else {
            head.next = removeElements(head.next, val);
            return head;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));


        System.out.println(solution.removeElements(node, 6));
    }
}

