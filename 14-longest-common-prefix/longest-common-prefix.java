class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";
        if (n == 1) return strs[0];

        String first = strs[0];
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < first.length(); j++) {
            char c = first.charAt(j);
            for (int i = 1; i < n; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
