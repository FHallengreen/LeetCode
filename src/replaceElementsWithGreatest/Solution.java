package replaceElementsWithGreatest;

import java.util.Arrays;

public class Solution {

    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
        
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = {17,18,5,4,6,1};

        System.out.println(Arrays.toString(solution.replaceElements(arr)));
    }
}
