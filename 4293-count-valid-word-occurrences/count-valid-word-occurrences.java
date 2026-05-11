import java.util.*;

class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        StringBuilder sb = new StringBuilder();
        for (String chunk : chunks) {
            sb.append(chunk);
        }
        String s = sb.toString();
        int n = s.length();
        Map<String, Integer> freq = new HashMap<>();
        int i = 0;

        while (i < n) {
            if (!isLower(s.charAt(i))) {
                i++;
                continue;
            }
            int start = i;

            while (i < n) {
                char c = s.charAt(i);

                if (isLower(c)) {
                    i++;
                } else if (c == '-' && (i + 1) < n && isLower(s.charAt(i + 1))) {
                    i++;
                } else {
                    break;
                }
            }
            String word = s.substring(start, i);
            freq.merge(word, 1, Integer::sum);
        }
        int[] ans = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            ans[j] = freq.getOrDefault(queries[j], 0);
        }
        return ans;
    }

    private boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }
}