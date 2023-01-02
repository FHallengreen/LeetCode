package PalindromeLinkedList;


import ReverseLinkedList.ListNode;

import java.util.List;

/* https://leetcode.com/problems/palindrome-linked-list/?fbclid=IwAR1xRrwY2lYTV5W5i0gVECAdW6VwON7cdkCIn_s8PWLkFP512Bb83-NOw7g */
public class Solution {

    ListNode start = null;

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        start = head;
        return checkIfPalindrome(head);

    }

    public boolean checkIfPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        boolean backwards = checkIfPalindrome(head.next);

        if (!backwards) {
            return false;
        } else if (start.val == head.val) {
            start = start.next;
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))));


        System.out.println(solution.isPalindrome(node));
    }

}
