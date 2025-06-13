class Solution {
    public int appendCharacters(String s, String t) {
        int first = 0;
        int longPre = 0;
        while(first < s.length() && longPre < t.length()){
            if(s.charAt(first) == t.charAt(longPre)){
                longPre++;
            }
            first++;
        }
        return t.length()-longPre;
    }
}