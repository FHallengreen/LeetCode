package MaximumNumberofBalloons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> balloonMap = new HashMap<>();
        balloonMap.put('b', 0);
        balloonMap.put('a', 0);
        balloonMap.put('l', 0);
        balloonMap.put('o', 0);
        balloonMap.put('n', 0);

        char[] cArr = text.toCharArray();

        for (char c : cArr) {
            if (balloonMap.containsKey(c)) {
                balloonMap.put(c, balloonMap.get(c) + 1);
            }
        }
        int b = balloonMap.get('b');
        int a = balloonMap.get('a');
        int l = balloonMap.get('l') / 2;
        int o = balloonMap.get('o') / 2;
        int n = balloonMap.get('n');

        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String text = "loonbalxballpoon";
        int result = solution.maxNumberOfBalloons(text);
        System.out.println(result);

    }
}
