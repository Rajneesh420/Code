class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> dp = new HashMap<>();
        for(char c : s.toCharArray()){
            dp.put(c,dp.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            if(!dp.containsKey(c)) return false;
            dp.put(c,dp.get(c)-1);
            if (dp.get(c) < 0) return false;
        }
        for(int value : dp.values()){
            if(value != 0) return false;
        }
        return true;
    }
}