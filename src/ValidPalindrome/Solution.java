package ValidPalindrome;

import java.util.Collection;
import java.util.Collections;

public class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(s));
    }
}
