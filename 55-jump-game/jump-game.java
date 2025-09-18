class Solution {
    public boolean canJump(int[] nums) {
        int curl = 0,n=nums.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,i+nums[i]);
            if(i == curl) curl = max;
            if(curl >= n-1) return true;
        }
        return false;
    }
}