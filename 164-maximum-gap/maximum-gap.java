class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max_gap=0;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            if(nums[j]-nums[i]>max_gap){
                max_gap=nums[j]-nums[i];
            }
        }
        return max_gap;
    }
}