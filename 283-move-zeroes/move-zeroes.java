class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        for(right=0;right<n;right++) {
          if(nums[right]!=0)
          {
            nums[left]=nums[right];
            left++;
          }
        }

        while(left<n)
        {
          nums[left]=0;
          left++;
        }
    }
}