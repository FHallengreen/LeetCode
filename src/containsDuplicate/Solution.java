package containsDuplicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(nums));

    }
}
