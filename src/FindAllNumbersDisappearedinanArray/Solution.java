package FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean [] appears = new boolean[nums.length + 1];

        for (int num : nums) {
            appears[num] = true;
        }
        System.out.println(Arrays.toString(appears));

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < appears.length; i++) {
            if (!appears[i]){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = solution.findDisappearedNumbers(nums);
        System.out.println(list);
    }
}
