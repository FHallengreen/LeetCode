package ConcatenationofArray;

import java.util.Arrays;

public class Solution {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getConcatenation(nums)));
    }
}
