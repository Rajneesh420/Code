class Solution {
    public static void DFS(int[] nums,int i,int sum,List<Integer> local,int target,List<List<Integer>> result) {
        if (sum > target) return; // pruning
        if (sum == target) {
            result.add(new ArrayList<>(local));
            return;
        }
        if (i >= nums.length) return;
        local.add(nums[i]);
        DFS(nums, i, sum + nums[i], local, target, result);
        local.remove(local.size() - 1);
        DFS(nums, i + 1, sum, local, target, result);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        DFS(candidates,0,0,new ArrayList<>(),target,result);
        return result;
    }
}