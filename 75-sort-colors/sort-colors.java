class Solution {
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public void sortColors(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int mid = 0;
        while(mid <= right) {
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,right,mid);
                right--;
            }
        }
    }
}