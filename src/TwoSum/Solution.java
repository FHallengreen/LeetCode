package TwoSum;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
    return solution;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}
