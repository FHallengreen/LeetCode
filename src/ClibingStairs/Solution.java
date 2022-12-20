package ClibingStairs;

public class Solution {
    public static int climbStairs(int n) {
        int countSteps = 0;

        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < n; i++) {
        countSteps = n1 + n2;
        n1 = n2;
        n2 = countSteps;
        }
        return countSteps;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
