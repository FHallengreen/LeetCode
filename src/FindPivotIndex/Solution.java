package FindPivotIndex;

public class Solution {

    public int pivotIndex(int[] nums) {


        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        int sumLeft = 0;
        int sumRight;

        for (int i = 0; i < nums.length; i++) {
            sumRight = sum - sumLeft - nums[i];

            if (sumLeft == sumRight){
                return i;
            }
            sumLeft += nums[i];
        }
    return -1;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] nums = {1,7,3,6,5,6};
        System.out.println(solution.pivotIndex(nums));

    }
}
