class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int m = p.length();

        if (m > n) return result;

        int[] mp1 = new int[26];
        int[] mp2 = new int[26];
        for (int i = 0; i < m; i++) {
            mp1[p.charAt(i) - 'a']++;
            mp2[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(mp1, mp2)) {
            result.add(0);
        }
        for (int i = m; i < n; i++) {
            mp2[s.charAt(i) - 'a']++;
            mp2[s.charAt(i - m) - 'a']--;
            if (Arrays.equals(mp1, mp2)) {
                result.add(i - m + 1);
            }
        }

        return result;

    }
}