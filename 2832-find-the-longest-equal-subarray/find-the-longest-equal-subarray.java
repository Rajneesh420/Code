class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int n = nums.size();
        Map<Integer,Integer> map = new HashMap<>();
        int left=0,right=0,maxFreq=0,max=0;
        for(right=0;right<n;right++) {
          map.put(nums.get(right),map.getOrDefault(nums.get(right),0)+1);
          maxFreq = Math.max(maxFreq, map.get(nums.get(right)));
          while((right-left+1)-maxFreq>k) {
            map.put(nums.get(left),map.get(nums.get(left)) - 1);
            left++;
          }
        }
        return maxFreq;
    }
}