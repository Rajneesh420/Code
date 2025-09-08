class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int max = 0;
        int start = 0; 

        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= start) {
                start = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}