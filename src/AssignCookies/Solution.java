package AssignCookies;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                result++;
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] g = {1,2};
        int [] s = {1,2,3};

        Solution solution = new Solution();

        int contentChildren = solution.findContentChildren(g, s);

        System.out.println("Maximum number of content children: " + contentChildren);
    }
}
