package ValidPalindromeII;

import java.util.Arrays;

public class Solution {

    public boolean validPalindrome(String s) {

        String s2 = new StringBuilder(s).reverse().toString();

        char[] cArr = s.toCharArray();
        char[] cArr2 = s2.toCharArray();
        Arrays.sort(cArr);
        Arrays.sort(cArr2);
        
        return s2.equals(s);
    }

    public static void main(String[] args) {


        String s = "aba";
        Solution solution = new Solution();

        System.out.println(solution.validPalindrome(s));

    }
}
