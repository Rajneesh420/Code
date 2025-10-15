class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, start = -1;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c));
            }
            
            map.put(c, i);
            ans = Math.max(ans, i - start);
        }
        
        return ans;
    }
}