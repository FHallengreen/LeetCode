
import ReverseLinkedList.ListNode;

public class LinkedLists {

    public static void main(String[] args) {
        ListNode n = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        LinkedLists ll = new LinkedLists();

        ListNode res = ll.reversedList(null, n);

        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
/*        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
        System.out.println(res.next.next.next.next.val);*/
    }

    public ListNode reversedList(ListNode previous, ListNode current){
        if(current.next == null) {
            current.next = previous;
            return current;
        }
        //First time you enter the method, previous has to be null, as the first element we go into does not have a previous (index 0)
        ListNode currentsRealNext = current.next;
        if(previous != null){
            current.next = previous;
        }else{
            //This is only hit on the first index, and sets the reference to null, as it should not point to anything
            current.next = null;
        }
        return reversedList(current, currentsRealNext);
    }


}