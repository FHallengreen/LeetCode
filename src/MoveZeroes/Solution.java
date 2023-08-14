package MoveZeroes;

import java.util.Arrays;

public class Solution {

    public void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j] + 1 == 0) {
                        break;
                    }
                    if ((nums[i] == 0)) {
                        int temp = nums[i];
                        nums[i] = nums[j + 1];
                        nums[j + 1] = temp;
                    }

                }
            }
        }

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {0, 1, 0, 3, 12};

        solution.moveZeroes(arr);

    }
}
