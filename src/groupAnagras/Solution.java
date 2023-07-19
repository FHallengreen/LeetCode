package groupAnagras;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        if (strs.length == 0) {
            return result;
        }

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);

            String sortedString = Arrays.toString(charArray);

            if (!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(strs[i]);

        }
        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(s));
    }


}
