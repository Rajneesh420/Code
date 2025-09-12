class Solution {
    private Boolean[][] memo;
    
    public boolean dfs(int i, int sum, int[] nums, int target) {
        if (sum == target) return true;
        if (i >= nums.length || sum > target) return false;
        
        if (memo[i][sum] != null) return memo[i][sum];
        
        boolean include = dfs(i + 1, sum + nums[i], nums, target);
        boolean exclude = dfs(i + 1, sum, nums, target);
        
        memo[i][sum] = include || exclude;
        return memo[i][sum];
    }
    
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        
        if (total % 2 != 0) return false;
        
        int target = total / 2;
        memo = new Boolean[nums.length][target + 1];
        
        return dfs(0, 0, nums, target);
    }
}
