package LengthOfLastWord;

public class Solution {

    public int lengthOfLastWord(String s) {

        String[] split = s.split(" ");

        return split[split.length-1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s));
    }
}
