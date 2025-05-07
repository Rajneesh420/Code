class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int n = s.length();
        int[] arr = new int[128];
        Arrays.fill(arr,-1);
        for(int right = 0;right<n;right++){
            if(arr[s.charAt(right)]>=left)
            {
                left = arr[s.charAt(right)]+1;
            }
            arr[s.charAt(right)] = right;
            max = Math.max(max,right-left+1);
        }
        return max;

    }
}