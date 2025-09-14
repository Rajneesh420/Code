class Solution {
    public boolean checkInclusion(String p, String s) {
        int n = p.length();
        int m = s.length();

        if (m < n) return false;

        int[] mp1 = new int[26];
        int[] mp2 = new int[26];
        for (int i = 0; i < n; i++) {
            mp1[p.charAt(i) - 'a']++;
            mp2[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(mp1, mp2)) {
            return true;
        }
        for (int i = n; i < m; i++) {
            mp2[s.charAt(i) - 'a']++;
            mp2[s.charAt(i - n) - 'a']--;
            if (Arrays.equals(mp1, mp2)) {
                return true;
            }
        }

        return false;
    }
}
