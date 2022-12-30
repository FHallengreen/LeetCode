package ReverseLinkedList;

public class Solution {

    ListNode start = new ListNode();


    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        } else {
            reverse(head);
        }
        return start;
    }

    public ListNode reverse(ListNode head) {
        if (head.next == null) {
            start = head;
            return head;
        }

        ListNode oldHead = reverse(head.next);
        head.next = null;
        oldHead.next = head;

        return head;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(solution.reverseList(head));
    }

}
