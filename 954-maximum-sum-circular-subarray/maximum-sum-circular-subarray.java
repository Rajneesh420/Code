class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int cursum1=0,cursum2 = 0;
        for(int num : nums) {
            sum+=num;
            cursum1=Math.max(num,cursum1+num);
            max = Math.max(max,cursum1);

            cursum2 = Math.min(num,cursum2+num);
            min = Math.min(min,cursum2);
        }
        if (sum == min) {
            return max;
        }
        return Math.max(max,sum-min);
    }
}