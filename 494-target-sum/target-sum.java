class Solution {
    public int DFS(int[] nums, int sum, int i, int target,int[][] dp,int offset) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }
        
        if (dp[i][sum + offset] != -1) {
            return dp[i][sum + offset];
        }
        
        int count1 = DFS(nums, sum + nums[i], i + 1, target, dp, offset);
        int count2 = DFS(nums, sum - nums[i], i + 1, target, dp, offset);
        
        dp[i][sum + offset] = count1 + count2;
        return dp[i][sum + offset];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;       
        int offset = 0;
        for (int num : nums) {
            offset += num;
        }       
        int[][] dp = new int[n][2 * offset + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }   
        return DFS(nums, 0, 0, target, dp, offset);
    }
}
