class Solution {
    public static int Help(int[] nums,int start,int end)
    {
        int pre = 0, curr = 0;
        for(int i=start;i<=end;i++)
        {
            int t = Math.max(curr,pre+nums[i]);
            pre = curr;
            curr = t;
        }
        return curr;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(Help(nums,0,n-2),Help(nums,1,n-1));
    }
}