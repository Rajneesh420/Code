class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1) return n;
        int left = 0;
        for(int right=1;right<n;right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}