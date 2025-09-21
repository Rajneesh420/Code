class Solution {
    public void swap(int[] nums,int left,int right){
        while(left<right){
            int t= nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length; //7
        k = k%n; // 3%7 = 3.   7-3=4
        swap(nums,0,n-k-1);
        swap(nums,n-k,n-1);
        swap(nums,0,n-1);

    }
}