class Solution {
    public int DFS(int[] nums, int sum, int i, int target) {
        if(i == nums.length) {
            return sum == target ? 1 : 0;
        }
        int count1 = DFS(nums, sum + nums[i], i + 1, target);
        int count2 = DFS(nums, sum - nums[i], i + 1, target);
        return count1 + count2;
    }

    public int findTargetSumWays(int[] nums, int target) {
        return DFS(nums, 0, 0, target);
    }
}
