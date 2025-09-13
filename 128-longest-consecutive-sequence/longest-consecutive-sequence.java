class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLen = 0;
        
        // Iterate over each unique number
        for (int num : set) {
            // Only start sequence if num - 1 is not in the set
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;
                
                // Explore forward sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }
                
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;

    }
}