class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> dp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(dp.containsKey(target-nums[i])){
                return new int[]{dp.get(target-nums[i]),i};
            }
            dp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}