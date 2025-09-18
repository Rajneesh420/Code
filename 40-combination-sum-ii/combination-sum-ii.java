class Solution {
    public static void DFS(int[] nums, int start, int sum, List<Integer> local, int target, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(local));
            return;
        }
        if (sum > target) return;

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            local.add(nums[i]);
            DFS(nums, i + 1, sum + nums[i], local, target, result); 
            local.remove(local.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        DFS(candidates, 0, 0, new ArrayList<>(), target, result);
        return result;
    }
}
