package IsSubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int position = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = position; j < tArr.length; j++) {
                if (sArr[i] == tArr[j]) {
                    position = j + 1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(solution.isSubsequence(s, t));

    }
}
