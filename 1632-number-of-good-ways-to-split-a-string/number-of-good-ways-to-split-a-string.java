class Solution {
    public int numSplits(String s) {
        int n = s.length();
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        Set<Character> leftSet = new HashSet<>();
        Set<Character> rightSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            leftSet.add(s.charAt(i));
            left[i] = leftSet.size();
        }
        
        for (int i = n - 1; i >= 0; i--) {
            rightSet.add(s.charAt(i));
            right[i] = rightSet.size();
        }
        
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (left[i] == right[i + 1]) {
                count++;
            }
        }
        
        return count;
    }
}