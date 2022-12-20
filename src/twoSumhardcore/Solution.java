package twoSumhardcore;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {

        LinkedList<Integer> newL1 = new LinkedList<>();
        LinkedList<Integer> newL2 = new LinkedList<>();


        Collections.reverse(l1);
        Collections.reverse(l2);
        StringBuilder l1String = new StringBuilder();
        StringBuilder l2String = new StringBuilder();
        for (int l: newL1) {
            l1String.append(l);
        }
        for (int l: newL2) {
            l2String.append(l);
        }
        int l1Int = Integer.parseInt(String.valueOf(l1String));
        int l2Int = Integer.parseInt(String.valueOf(l2String));

        int result = l1Int + l2Int;
        String resultString = String.valueOf(result);

        LinkedList resultList = new LinkedList<>();
        for (int i = 0; i < resultString.length(); i++) {
            resultList.add(resultString.charAt(i));
        }
        LinkedList reversedResultList = new LinkedList<>();
        for (int i = resultList.size(); i > 0; i--) {
            reversedResultList.add(resultList.get(i));
        }

        return resultList;
    }

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        int[] l1arr = {9,9,9,9,9,9,9};
        for (int i = 0; i < l1arr.length; i++) {
            l1.add(l1arr[i]);
        }
        LinkedList<Integer> l2 = new LinkedList<>();
        int[] l2arr = {9,9,9,9};
        for (int i = 0; i < l2arr.length; i++) {
            l2.add(l2arr[i]);
        }

        System.out.println(addTwoNumbers(l1,l2));

    }
}
