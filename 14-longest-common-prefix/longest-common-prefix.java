class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String s = strs[0];
        int j = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
            j++;
        }
        return sb.toString();
    }
}
