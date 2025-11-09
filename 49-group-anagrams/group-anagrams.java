import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            throw new IllegalArgumentException("Input array must have at least one element.");
        }

        Map<String, List<String>> dp = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);  // Sorted string as key

            dp.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(dp.values());
    }
}