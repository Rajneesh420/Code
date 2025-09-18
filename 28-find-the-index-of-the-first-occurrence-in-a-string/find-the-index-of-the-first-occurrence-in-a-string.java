class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;

        int m = needle.length();
        int n = haystack.length();

        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
