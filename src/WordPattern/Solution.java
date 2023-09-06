package WordPattern;

import java.util.HashMap;
import java.util.Objects;

public class Solution {

    public boolean wordPattern(String pattern, String s) {


        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (patternMap.containsKey(pattern.charAt(i)) || sMap.containsKey(words[i])) {
                if (!Objects.equals(patternMap.get(pattern.charAt(i)), words[i]) || !Objects.equals(sMap.get(words[i]), pattern.charAt(i))) {
                    return false;
                }
            } else {
                patternMap.put(pattern.charAt(i), words[i]);
                sMap.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "dog cat cat dog";
        String pattern = "aaaa";

        System.out.println(solution.wordPattern(pattern, s));

    }
}
