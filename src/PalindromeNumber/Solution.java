package PalindromeNumber;

public class Solution {

    public static boolean isPalindrome(int x) {

        char[] s = ("" + x).toCharArray();

        for (int i = 0; i < s.length; i++) {
                if (s[i] != s[s.length-1-i]) {
                    return false;
                }
            }
        return true;
        }

    public static void main(String[] args) {
        int x = -121;

        System.out.println(isPalindrome(x));

    }
}
